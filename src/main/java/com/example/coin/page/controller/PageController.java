package com.example.coin.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("goSignup")
    public String signup() {
        return "signup";
    }

    @GetMapping("goLogin")
    public String login() {
        return "login";
    }

    @GetMapping("goPay")
    public String pay() {
        return "pay";
    }

    @GetMapping("goMarket")
    public String market() {
        return "market";
    }

    @GetMapping("goHistory")
    public String history() {
        return "history";
    }

}
