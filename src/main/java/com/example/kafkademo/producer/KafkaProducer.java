package com.example.kafkademo.producer;

import com.example.kafkademo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Value("${kafka.topic.user}")
    private String topicUser;

    public void sendMsg(){
        kafkaTemplate.send(topicUser,creatUser().toString());
        log.info("消息已成功发送到kafka");
    }

    private User creatUser() {
        User user = new User();
        user.setId(new Random().nextLong())
                .setAge(new Random().nextInt(2))
                .setName("John");
        return user;
    }
}
