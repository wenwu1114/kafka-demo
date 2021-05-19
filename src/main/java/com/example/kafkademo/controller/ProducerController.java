package com.example.kafkademo.controller;

import com.example.kafkademo.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private KafkaProducer producer;

    @GetMapping("/priducer")
    public ResponseEntity producer(){
        producer.sendMsg();
        return ResponseEntity.ok().build();
    }
}
