package com.example.coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface PointMapper {

    int insertPoint(HashMap<String, String> point);
    double checkBalance(String email);
    ArrayList<HashMap<String, Object>> selectPoint(String email);

}
