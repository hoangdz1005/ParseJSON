package com.SpringBoot.ParseJSON.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private String email;
    private String job;
    private String gender;
    private String city;
    private Integer salary;
    private String birthdate;
}
