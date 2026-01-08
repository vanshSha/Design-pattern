package com.structural_design_pattern.AdapterPattern;

public class SendGridService {

    public void sendEmail(String recipient, String title, String content ){
        System.out.println("Sending email via SendGrid to " + recipient);
        System.out.println("Tittle : " + title);
        System.out.println("Content : " + content);
    }
}
