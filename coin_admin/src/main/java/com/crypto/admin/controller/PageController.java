package com.crypto.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/")
    public String goLogin(){
        return "login";
    }

    @GetMapping("/goMember")
    public String goMember(){
        return "memberList";
    }

    @GetMapping("/goPayment")
    public String goPay(){
        return "paymentList";
    }

    @GetMapping("/goBuy")
    public String goBuy(){
        return "buyList";
    }
    @GetMapping("/goContact")
    public String goContact(){
        return "contactList";
    }
    @GetMapping("/goSubscribe")
    public String goSubscribe(){
        return "subscribeList";
    }
}
