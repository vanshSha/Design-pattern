package com.basic.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("VanshDebitCard", new DebitCard("1234", "Vansh Sharma"));
        ps.addPaymentMethod("HimanshiCreditCard", new CreditCard("123", "Himanshu"));
        ps.addPaymentMethod("Mac", new UPI("mac@upi"));
        ps.addPaymentMethod("MacWallet", new Wallet());



        ps.makePayment("Mac");
        ps.makePayment("VanshDebitCard");
        ps.makePayment("MacWallet");


    }
}
