package com.example.coin.service;

import com.example.coin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository tr;

    public int joinTodo (HashMap<String, String> joinTodo2) {
        return tr.joinTodo(joinTodo2);
    }

    public HashMap<String,String> loginTodo(String send){
        return tr.loginTodo(send);
    }

    public int payTodo(HashMap<String, String> payTodo) {
        System.out.println(payTodo.toString());
        return tr.payTodo(payTodo);
    }

}
