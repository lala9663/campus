package com.example.coin.member.controller;

import com.example.coin.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService ts;

    @PostMapping("/signup")
    public String signup(@RequestParam HashMap<String, String> params) {
        System.out.println(params.get("name"));
        System.out.println(params.get("email"));
        if (ts.joinTodo(params) > 0) {
            System.out.println("회원가입 성공");
            return "login";
        } else {
            System.out.println("회원가입 실패");
            return "signup";
        }
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String, String> params, HttpSession session) {
        System.out.println(params.get("email"));
        String email = params.get("email");
        String password = params.get("password");
        String view = "index";

        HashMap<String, String> member = ts.loginTodo(email);
        if (password.equals(member.get("password"))) {
            session.setAttribute("email", email);
            System.out.println("로그인성공");
        } else if (!password.equals(member.get("password"))) {
            System.out.println("비밀번호 틀렸습니다. 다시 로그인해주세요");
            view = "login";
        } else if (email.equals(member.get("email"))) {
            System.out.println("해당 이메일이 없습니다.");
            view = "login";
        }

        return view;
    }
// 1. 해당 이메일이 없을때


    @GetMapping("/hadBalance")
    public @ResponseBody int hadBalance(HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return ts.hadBalance(email);
        }
        return 0;
    }

    @GetMapping("/moneyBalance")
    public @ResponseBody int moneyBalance(HttpSession session) {
        if (session.getAttribute("emial") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return ts.moneyBalance(email);
        }
        return 0;
    }

    @GetMapping("havingBalance")
    public @ResponseBody ArrayList<HashMap<String, Object>> havingBalance(HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return ts.havingBalance(email);
        }
        return null;
    }
}
