package com.structural_design_pattern.FacadePattern.solution;

public class Client {
    public static void main(String[] args) {
        // Client code interacting with API Gateway (Facade)
        APIGateWay apiGateWay = new APIGateWay();
        System.out.println(apiGateWay.getFullOrderDetails("123", "456", "563"));
    }
}

/*
        Problem
           - Complexity of Client
           - Tight Coupling

        Solution
        - Simplified
        - Decoupling
        - Centralized Control
        - Consistency
 */