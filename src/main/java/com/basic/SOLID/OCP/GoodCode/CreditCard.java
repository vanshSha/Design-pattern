package com.basic.SOLID.OCP.GoodCode;

public class CreditCard  implements PaymentMethod{

     @Override
    public void pay(double amount) {
         System.out.println("Making Payment via CreditCard " + amount );
    }
}
