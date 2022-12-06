package com.example.coin.controller;

import com.example.coin.mapper.MemberMapper;
import com.example.coin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService ts;
    
    @PostMapping("/signup")
    public String signup(@RequestParam HashMap<String,String> params) {
        System.out.println(params.get("name"));
        System.out.println(params.get("email"));
        ts.joinTodo(params);
        System.out.println("회원가입 성공");
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String,String> params, HttpSession session) {
        System.out.println(params.get("email"));
        String email = params.get("email");
        String password = params.get("password");
        String view = "index";

        HashMap<String,String> member = ts.loginTodo(email);
        if (password.equals(member.get("password"))){
            session.setAttribute("email", email);
            System.out.println("로그인성공");
        } else if (!password.equals(member.get("password"))){
            System.out.println("비밀번호 틀렸습니다. 다시 로그인해주세요");
            view = "login";
        } else {
            System.out.println("해당 이메일이 없습니다.");
            view = "login";
        }

        return view;
    }
// 1. 해당 이메일이 없을때

}
