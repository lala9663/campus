package com.crypto.admin.repository;

import com.crypto.admin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class AdminRepository {

    @Autowired
    AdminMapper am;

    public HashMap<String,Object> selectAdmin(HashMap<String,String> params){
        return am.selectAdmin(params);
    }
    public ArrayList<HashMap<String,Object>> selectMember(){
        return am.selectMember();
    }
    public ArrayList<HashMap<String,Object>> selectPayment(){
        return am.selectPayment();
    }
    public ArrayList<HashMap<String,Object>> selectBuy(){
        return am.selectBuy();
    }
    public ArrayList<HashMap<String,Object>> selectContact(){
        return am.selectContact();
    }
    public ArrayList<HashMap<String,Object>> selectSubscribe(){
        return am.selectSubscribe();
    }
    public int selectCntMember(){
        return am.selectCntMember();
    }
    public int selectCntContact(){
        return am.selectCntContact();

    }
    public int selectCntBuy(){
        return am.selectCntBuy();

    }
    public double selectAmountPayment(){
        return am.selectAmountPayment();

    }
}
