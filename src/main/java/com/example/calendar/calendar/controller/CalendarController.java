package com.example.calendar.calendar.controller;


import com.example.calendar.dto.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;

@RestController
public class CalendarController {

    private ArrayList<Calendar> calList=new ArrayList<>();

    @GetMapping("/all/schedule")
    public ArrayList<Calendar> allSchedule(){
        return calList;
    }

    @GetMapping("/put/schedule")
    public ArrayList<Calendar> allSchedule(Calendar cal){
       boolean flag=true;
        for(int i=0;i<calList.size();i++){
            if(calList.get(i).getDate().equals(cal.getDate())){
                calList.set(i,cal);
                flag=false;
            }
        }
        if(flag)
        calList.add(cal);

        return calList;
    }



}
