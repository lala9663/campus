package com.example.coin.point.controller;

import com.example.coin.point.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class PointController {

    @Autowired
    PointService ps;

    @GetMapping("/checkBalance")
    public String checkBalance(HttpSession session, String total) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            double balance = ps.checkBalance(email);
            double totalAmount = Double.valueOf(total);

            if ((balance - totalAmount) > 0) {
                return "can";
            } else {
                return "cannot";
            }
        } else {
            return "login";
        }
    }

    @GetMapping("/pointList")
    public @ResponseBody ArrayList<HashMap<String, Object>> pointList(HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return ps.selectPoint(email);
        }
        return null;
    }
}
