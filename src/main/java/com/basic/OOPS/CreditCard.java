package com.basic.OOPS;

public class CreditCard extends Card {

    public CreditCard(String number, String userName) {
        super(number, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via CreditCard");
    }
}
