package com.structural_design_pattern.FacadePattern.solution;

// Facade
public class APIGateWay {

    UserService userService;

    OrderService orderService;

    PaymentService paymentService;

    public APIGateWay(){
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    // Task
    public String getFullOrderDetails(String userId, String orderId, String paymentId){
        String userDetails = userService.getUserDetails(userId);
        String orderDetails = orderService.getOrderService(orderId);
        String paymentDetails = paymentService.getPaymentService(paymentId);

        return userDetails + "\n" + orderDetails + "\n" + paymentDetails;
    }
}
