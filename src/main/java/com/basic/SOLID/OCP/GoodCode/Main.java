package com.basic.SOLID.OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod upiPayment = new UPI();

        paymentProcessor.processorPayment(creditCard, 1000 );
        paymentProcessor.processorPayment(upiPayment, 230);
    }
}
