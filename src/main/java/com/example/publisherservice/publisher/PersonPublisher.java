package com.example.publisherservice.publisher;

import com.example.publisherservice.config.MessagingConfig;
import com.example.publisherservice.dto.Address;
import com.example.publisherservice.dto.Person;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonPublisher {

    private final RabbitTemplate template;

    @RequestMapping
    public String publishPerson(@RequestBody Person person){
        Person toPublish = person;
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, toPublish);
        return "Success!!";
    }


}
