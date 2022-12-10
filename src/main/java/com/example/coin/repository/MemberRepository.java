package com.example.coin.repository;

import com.example.coin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public int joinTodo(HashMap<String,String> joinTodo1){

        return mapper.join(joinTodo1);
    }

    public HashMap<String,String> loginTodo(String mail){

        return mapper.login(mail);
    }

    public int payTodo(HashMap<String, String> payTodo) {

        return mapper.charge(payTodo);
    }

}
