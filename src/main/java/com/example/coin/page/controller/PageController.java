package com.example.coin.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        System.out.println("메인페이지로 이동");
        return "index";
    }

    @GetMapping("goSignup")
    public String signup(HttpSession session) {
        if (session.getAttribute("email") == null) {
            System.out.println("회원가입페이지");
            return "signup";
        } else {
            System.out.println("로그인 한 상태입니다.");
            return "redirect:/";
        }
    }

    @GetMapping("goLogin")
    public String login(HttpSession session) {
        if (session.getAttribute("email") == null){
            System.out.println("로그인페이지");
            return "login";
        } else {
            System.out.println("로그인 한 상태입니다.");
            return "redirect:/";
        }
    }

    @GetMapping("goPay")
    public String pay(HttpSession session) {
        if (session.getAttribute("email") == null){
            System.out.println("로그인부터 해주세요");
            return "login";
        } else {
            session.setAttribute("pay", session.getAttribute("email"));
            System.out.println("pay페이지로 이동");
            return "pay";
        }
    }

    @GetMapping("goMarket")
    public String market(HttpSession session) {
        if (session.getAttribute("email") == null){
            System.out.println("로그인부터 해주세요");
            return "login";
        } else {
            session.getAttribute("email");
            System.out.println("market으로 이동");
            return "market";
        }
    }

    @GetMapping("goHistory")
    public String history(HttpSession session) {
        if (session.getAttribute("email") == null){
            System.out.println("로그인부터 해주세요");
            return "login";
        } else {
            session.getAttribute("email");
            return "history";
        }
    }

    @GetMapping("/goLogOut")
    public String logout(HttpSession session) {
        if (session.getAttribute("email") == null){
            System.out.println("로그인 한 상태가 아닙니다.");
        } else {
            session.setAttribute("email", null);
            System.out.println("logout");
        }
        return "index";
    }


}
