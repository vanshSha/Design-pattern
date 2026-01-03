package com.basic.SOLID.DSP.BadCode;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class NotificationService {

    private EmailService emailService;

    private SMSService smsService;


    public void notifyByEmail(String msg){
        emailService.sendEmail(msg);
    }

    public void notifyBySMS(String msg){
        smsService.sendSMS(msg);
    }

}
