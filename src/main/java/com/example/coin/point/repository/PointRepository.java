package com.example.coin.point.repository;

import com.example.coin.mapper.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class PointRepository {

    @Autowired
    PointMapper mapper;

    public double checkBalance(String email) {
        return mapper.checkBalance(email);
    }

    public ArrayList<HashMap<String, Object>> selectPoint(String email) {
        return mapper.selectPoint(email);
    }

}
