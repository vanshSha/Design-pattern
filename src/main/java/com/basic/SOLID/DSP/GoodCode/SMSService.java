package com.basic.SOLID.DSP.GoodCode;

public class SMSService implements NotificationChannel{

    @Override
    public void send(String msg) {
        System.out.println("Sending SMS " + msg);
    }
}
