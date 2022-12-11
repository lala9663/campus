package com.example.coin.coin.repository;

import com.example.coin.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CoinRepository {

    @Autowired
    CoinMapper mapper;

    public int buy(HashMap<String,String> params) {

        return mapper.buy(params);
    }

    public ArrayList<HashMap<String, Object>> selectBuy(String email) {

        return mapper.selectBuy(email);
    }
}
