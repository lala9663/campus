package com.example.coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface ContactMapper {

    int contact(HashMap<String,String> param);

}
