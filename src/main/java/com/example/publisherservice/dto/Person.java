package com.example.publisherservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Long personId;
    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;
}
