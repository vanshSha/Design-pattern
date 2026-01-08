package com.structural_design_pattern.AdapterPattern;

public class Client {
    public static void main(String[] args) {

        NotificationService notificationService = new EmailNotificationService();
        notificationService.send("sharmavansh7932@gmail.com", "order confirmation", "my order has been received ");

        // here problem is the occurring
        // NotificationService sendGridEmailService = new SendGridService();

        NotificationService emailServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
        emailServiceUsingSendGrid.send("sharmavansh7932@gmail.com", "order confirmation", "my order has been received ");


    }
}
