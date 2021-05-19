package com.example.kafkademo.controller;

import com.example.kafkademo.consumer.KafkaConsumerS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private KafkaConsumerS kafkaConsumerS;

    @GetMapping("/consumer")
    public ResponseEntity consume(){
        kafkaConsumerS.consume();
        return ResponseEntity.ok().build();
    }

}
