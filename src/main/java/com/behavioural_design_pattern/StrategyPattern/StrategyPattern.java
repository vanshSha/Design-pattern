package com.behavioural_design_pattern.StrategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {

        PaymentService1 paymentService = new PaymentService1();
        paymentService.setPaymentStrategy(new CreditCardPayment());
        paymentService.pay();

        paymentService.setPaymentStrategy(new DebitCardPayment());
        paymentService.pay();

        paymentService.setPaymentStrategy(new UPIPayment());
        paymentService.pay();



    }
}

// Strategy Interface
interface PaymentStrategy{

    void processPayment();

}

// Concrete Strategies : Credit Card
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making Payment via Credit Card");
    }
}

// Concrete Strategies : Debit Card
class DebitCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making Payment via Debit Card");
    }
}

// Concrete Strategy : Credit Card
class UPIPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making Payment via UPI");
    }
}


// Context
class PaymentService1 {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    public void pay(){
        paymentStrategy.processPayment(); // Polymorphic Behaviour
    }

}
