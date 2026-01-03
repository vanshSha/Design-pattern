package com.basic.SOLID.SRP.BadCode;

public class Invoice {
// problem 1 class isn't doing one responsibility instead of multiple responsibility
    private double amount;

    public Invoice(double amount){
        this.amount =  amount;
    }

    // Other Functionality
    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " + amount);
    }

    public void saveToDataBase(){
        System.out.println("Saving invoice to Database ");
    }

    public void sendEmailNotification(){
        System.out.println("Sending email notification for invoice");
    }

}
