package com.example.coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface MemberMapper {

    int join(HashMap<String,String> param);

    HashMap<String,String> login(String email);
    // 반환타입 , 메소드명, 내가 입력해서 넘길 값(파라미터)

    int charge(HashMap<String,String> param);   //  돈 충전하기

    int hadBalance(String email);

    int moneyBalance(String email);

    ArrayList<HashMap<String,Object>> havingBalance(String email);
}
