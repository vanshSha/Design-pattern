package com.structural_design_pattern.FacadePattern.problem;

public class Client {
    public static void main(String[] args) {

        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();


        // Task
        System.out.println(userService.getUserDetails("123"));
        System.out.println(orderService.getOrderService("456"));
        System.out.println(paymentService.getPaymentService("123"));

    }
}
