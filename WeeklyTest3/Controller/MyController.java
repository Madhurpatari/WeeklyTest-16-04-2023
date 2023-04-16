package com.Geekster.WeeklyTest3.Controller;

import com.Geekster.WeeklyTest3.JavaMailSender;
import com.Geekster.WeeklyTest3.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


@RestController
public class MyController {
    @Autowired //// This member variable is autowired by Spring
    private Student student1;
    @GetMapping("/student")
    public String getMappings() {
        String  message = student1.getMessage();
        String subject = "codersArea : confirmation";
        String to = "kmadhur07@gmail.com";
        String from = "kmadhur07@gmail.com";
        JavaMailSender mailSender = new JavaMailSender();
        mailSender.sendEmail(message, subject, to, from);

        return student1.getMessage();
    }
}
