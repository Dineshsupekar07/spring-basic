package com.example.ApSpring29.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail(@RequestParam String fromEmail,@RequestParam String toEmail, @RequestParam String subject, @RequestParam String body) {
        emailService.sendSimpleEmail(toEmail, subject, body);
        return "Email sent successfully";
    }
}


