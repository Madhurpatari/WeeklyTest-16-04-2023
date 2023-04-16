package com.Geekster.WeeklyTest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String message ="Hello World ! ";
    public String getMessage(){
        return  message;
    }
    public  void setMessage(String message){
        this.message = message;
    }
}
