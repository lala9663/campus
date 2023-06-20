package com.crypto.admin.controller;

import com.crypto.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class AdminController {
    @Autowired
    AdminService as;

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap <String,String> params, HttpSession session){

        HashMap <String,Object> result=as.selectAdmin(params);
        if(result==null){
            return "redirect:/";
        }
        return "redirect:/index";
    }
    @GetMapping("/selectMember")
    public @ResponseBody ArrayList<HashMap<String,Object>> selectMember(){
        return as.selectMember();
    }
    @GetMapping("/selectPayment")
    public @ResponseBody ArrayList<HashMap<String,Object>> selectPayment(){
        return as.selectPayment();
    }
    @GetMapping("/selectBuy")
    public @ResponseBody ArrayList<HashMap<String,Object>> selectBuy(){
        return as.selectBuy();
    }
    @GetMapping("/selectContact")
    public @ResponseBody ArrayList<HashMap<String,Object>> selectContact(){
        return as.selectContact();
    }
    @GetMapping("/selectSubscribe")
    public @ResponseBody ArrayList<HashMap<String,Object>> selectSubscribe(){
        return as.selectSubscribe();
    }
    @GetMapping("/selectCntMember")
    public @ResponseBody int selectCntMember(){
        return as.selectCntMember();
    }
    @GetMapping("/selectCntContact")
    public @ResponseBody int selectCntContact(){
        return as.selectCntContact();
    }
    @GetMapping("/selectCntBuy")
    public @ResponseBody int selectCntBuy(){
        return as.selectCntBuy();
    }
    @GetMapping("/selectAmountPayment")
    public @ResponseBody double selectAmountPayment(){
        return as.selectAmountPayment();
    }


}
