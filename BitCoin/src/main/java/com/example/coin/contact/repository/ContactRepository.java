package com.example.coin.contact.repository;

import com.example.coin.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper mapper;

    public int contactTodo(HashMap<String, String> contactTodo) {

        return mapper.contact(contactTodo);
    }

    public int subscribeTodo(HashMap<String, String> subscribeTodo) {

        return mapper.subscribe(subscribeTodo);
    }

}
