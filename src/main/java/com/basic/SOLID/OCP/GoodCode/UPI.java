package com.basic.SOLID.OCP.GoodCode;

public class UPI implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making payment via a UPI " + amount);
    }
}
