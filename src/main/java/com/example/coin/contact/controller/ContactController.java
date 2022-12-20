package com.example.coin.contact.controller;

import com.example.coin.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ContactController {

    @Autowired
    ContactService cs;

    @PostMapping("/requestCall")
    public String contact(@RequestParam HashMap<String, String> params) {
        System.out.println(params.get("name"));
        cs.contactTodo(params);
        System.out.println("연락하기");
        return "redirect:/";
    }

    @PostMapping("/subscribe")
    public String subscribe(@RequestParam HashMap<String,String> params) {
        System.out.println(params.get("emdail"));
        cs.subscribeTodo(params);
        System.out.println("구독하기");
        return "redirect:/";
    }

}
