package com.Geekster.WeeklyTest3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Configuration
public class AppConfig {
    @Bean
    public Student student1(){
        Student student1 = new Student();
        student1.setMessage("Hello from Student1");
        return student1;
    }
 }
