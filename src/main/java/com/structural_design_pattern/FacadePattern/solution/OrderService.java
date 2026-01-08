package com.structural_design_pattern.FacadePattern.solution;

// Subsystem classes
public class OrderService {

    public String getOrderService(String orderId){
        return "Oder details for OderId" + orderId;
    }
}
