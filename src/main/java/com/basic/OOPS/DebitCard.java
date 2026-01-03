package com.basic.OOPS;

public class DebitCard extends Card{

    public DebitCard(String cardNo, String userName) {
        super(cardNo,userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via DebitCard" + cardNo);
    }

    // If i am using private access modifier then > I will use getCardNo.
    // now I am using protected
}
