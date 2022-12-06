package com.example.coin.service;

import com.example.coin.repository.ContactRepository;
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

}
