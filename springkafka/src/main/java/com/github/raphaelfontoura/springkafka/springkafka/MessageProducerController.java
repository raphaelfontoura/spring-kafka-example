package com.github.raphaelfontoura.springkafka.springkafka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("send-message")
public class MessageProducerController {

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @GetMapping("{message}")
  public void sendMessage(@PathVariable String message) {
      kafkaTemplate.send("my-topic.client1", message);
  }
  

}
