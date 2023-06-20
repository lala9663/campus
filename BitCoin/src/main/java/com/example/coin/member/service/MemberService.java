package com.example.coin.member.service;

import com.example.coin.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class
MemberService {

    @Autowired
    MemberRepository tr;

    public int joinTodo (HashMap<String, String> joinTodo2) {
        return tr.joinTodo(joinTodo2);
    }

    public HashMap<String,String> loginTodo(String send){
        return tr.loginTodo(send);
    }

    public int hadBalance(String email) {
        return tr.hadBalance(email);
    }

    public int moneyBalance(String email) {
        return tr.moneyBalance(email);
    }

    public ArrayList<HashMap<String, Object>> havingBalance(String email) {
        return tr.havingBalance(email);
    }

}
