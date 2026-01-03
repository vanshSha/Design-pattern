package com.basic.SOLID.OCP.GoodCode;

public class DebitCard implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via DebitCard");
    }
}
