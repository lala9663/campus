package com.example.coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface PointMapper {

    double checkBalance(String email);

    ArrayList<HashMap<String, Object>> selectPoint(String email);

}
