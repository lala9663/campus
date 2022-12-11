package com.crypto.admin.service;

import com.crypto.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class AdminService {

    @Autowired
    AdminRepository ar;

    public HashMap<String,Object> selectAdmin(HashMap<String,String> params){
        return ar.selectAdmin(params);
    }
    public ArrayList<HashMap<String,Object>> selectMember(){
        return ar.selectMember();
    }
    public ArrayList<HashMap<String,Object>> selectPayment(){
        return ar.selectPayment();
    }
    public ArrayList<HashMap<String,Object>> selectBuy(){
        return ar.selectBuy();
    }
    public ArrayList<HashMap<String,Object>> selectContact(){
        return ar.selectContact();
    }
    public ArrayList<HashMap<String,Object>> selectSubscribe(){
        return ar.selectSubscribe();
    }
    public int selectCntMember(){
        return ar.selectCntMember();
    }
    public int selectCntContact(){
        return ar.selectCntContact();

    }
    public int selectCntBuy(){
        return ar.selectCntBuy();

    }
    public double selectAmountPayment(){
        return ar.selectAmountPayment();

    }
}
