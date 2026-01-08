package com.structural_design_pattern.FacadePattern.solution;

// Subsystem classes
public class PaymentService {

    public String getPaymentService(String paymentId){
        return "Payment details for paymentId" + paymentId;
    }
}
