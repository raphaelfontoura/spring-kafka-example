package com.github.raphaelfontoura.springkafka.springkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerTeste {

  @KafkaListener(topics = "my-topic.client1", groupId = "group1")
  public void consumer(String message) {
    System.out.println(message);
  }

}
