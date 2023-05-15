package com.SpringBoot.ParseJSON.repository;

import com.SpringBoot.ParseJSON.model.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class PersonRepository {
    private ArrayList<Person> persons = new ArrayList<>();
    public PersonRepository() {
        try{
            File file = ResourceUtils.getFile("classpath:static/person.json");
            ObjectMapper mapper = new ObjectMapper();
            persons.addAll(mapper.readValue(file, new TypeReference<List<Person>>() {}));
            persons.forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public List<Person> getAllPerson() {
        return persons;
    }
}
