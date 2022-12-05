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
        HashMap<String,String> member = ts.loginTodo(email);
        if (params.get("password").equals(member.get("password"))){
            session.setAttribute("email", email);
            System.out.println("로그인성공");
        }

        return "index";
    }
// 1. 해당 이메일이 없을때
//  2. 비밀번호 틀렸을때
    //
}
