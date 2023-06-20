package com.example.coin.contact.service;

import com.example.coin.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ContactService {

    @Autowired
    ContactRepository rs;

    public int contactTodo(HashMap<String, String> contactTodo) {
        return rs.contactTodo(contactTodo);
    }

    public int subscribeTodo (HashMap<String,String> subscribeTodo){

        return rs.subscribeTodo(subscribeTodo);
    }

}
