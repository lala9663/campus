package com.example.coin.member.repository;

import com.example.coin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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

    public int hadBalance(String email) {
        return mapper.hadBalance(email);
    }

    public int moneyBalance(String email) {
        return mapper.moneyBalance(email);
    }

    public ArrayList<HashMap<String, Object>> havingBalance(String email) {
        return mapper.havingBalance(email);
    }

}
