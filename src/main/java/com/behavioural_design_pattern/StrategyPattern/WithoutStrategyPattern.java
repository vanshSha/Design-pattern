package com.behavioural_design_pattern.StrategyPattern;

public class WithoutStrategyPattern {
    public static void main(String[] args) {
       PaymentService service = new PaymentService();
       service.processPayment("UPI");
    }

}

class PaymentService {

    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("CreditCard")){
            System.out.println("Making Payment via Credit Card");
        }
        else if(paymentMethod.equals("DebitCard")){
            System.out.println("Making Payment via Debit Card");
        }
        else if(paymentMethod.equals("UPI")){
            System.out.println("Making Payment via UPI");
        }
        else {
            System.out.println("Unsupported Payment Method");
        }
    }
}
