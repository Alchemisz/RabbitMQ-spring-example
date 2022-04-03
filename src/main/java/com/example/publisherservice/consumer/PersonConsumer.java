package com.example.publisherservice.consumer;

import com.example.publisherservice.config.MessagingConfig;
import com.example.publisherservice.dto.Person;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@AllArgsConstructor
public class PersonConsumer {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consume(Person person){
        System.out.println(person.toString());
    }

}
