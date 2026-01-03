package com.basic.SOLID.DSP.GoodCode;

public class EmailService implements NotificationChannel{

    @Override
    public void send(String msg) {
        System.out.println("Sending Email " + msg );
    }
}
