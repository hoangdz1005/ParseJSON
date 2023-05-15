package com.SpringBoot.ParseJSON.controller;

import com.SpringBoot.ParseJSON.model.Person;
import com.SpringBoot.ParseJSON.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @GetMapping("/api/persons")
    public ResponseEntity<List<Person>> getAllPeople() {
        return ResponseEntity.ok().body(personRepository.getAllPerson());
    }

}
