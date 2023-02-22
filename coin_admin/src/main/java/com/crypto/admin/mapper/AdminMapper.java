package com.crypto.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface AdminMapper {

    public HashMap<String,Object> selectAdmin(HashMap<String,String> params);
    public ArrayList<HashMap<String,Object>> selectMember();
    public ArrayList<HashMap<String,Object>> selectPayment();
    public ArrayList<HashMap<String,Object>> selectBuy();
    public ArrayList<HashMap<String,Object>> selectContact();
    public ArrayList<HashMap<String,Object>> selectSubscribe();

    public int selectCntMember();
    public int selectCntContact();
    public int selectCntBuy();
    public double selectAmountPayment();
}
