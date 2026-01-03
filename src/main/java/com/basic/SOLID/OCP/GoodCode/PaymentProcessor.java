package com.basic.SOLID.OCP.GoodCode;

public class PaymentProcessor {

    public void processorPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}
