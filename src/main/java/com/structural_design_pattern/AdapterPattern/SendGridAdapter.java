package com.structural_design_pattern.AdapterPattern;

public class SendGridAdapter implements NotificationService {

    public SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }


    @Override
    public void send(String to, String subject, String body) {
        // Adapter Method -> Convert parameters and calls to SendGrids Methods
        sendGridService.sendEmail(to, subject, body);
    }
}
