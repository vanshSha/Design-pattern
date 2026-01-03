package com.basic.SOLID.SRP.GoodCode;

public class Invoice {
// only 1  class do one responsibility
    private double amount;

    public Invoice(double amount){
        this.amount =  amount;
    }

    // Other Functionality
    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " + amount);
    }

}
