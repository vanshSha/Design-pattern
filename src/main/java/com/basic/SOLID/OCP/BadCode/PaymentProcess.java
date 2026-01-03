package com.basic.SOLID.OCP.BadCode;

public class PaymentProcess {

    public void processPayment(String paymentMethod, double amount){
        if(paymentMethod.equals("CreditCard")){  // old code
            // business Logic
            System.out.println("Making Payment via CreditCard " + amount);
        }
        else if(paymentMethod.equals("UPI")){
            // business Logic
            System.out.println("Making Payment via UPI " + amount);
        }
        else if(paymentMethod.equals("DebitCard")){
            // business Logic
            System.out.println("Making Payment via DebitCard " + amount);
        }
        else {
            throw new IllegalArgumentException("Unsupported payment method " + paymentMethod) ;
        }

    }
}
