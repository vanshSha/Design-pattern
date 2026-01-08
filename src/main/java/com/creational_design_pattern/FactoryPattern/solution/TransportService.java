package com.creational_design_pattern.FactoryPattern.solution;

// Client
public class TransportService {

    public static void main(String[] args) {

        // Directly creates objects
        Transport vehicle = new TransportFactory().createTransport("fake taxi");
        vehicle.deliver();

    }
}
