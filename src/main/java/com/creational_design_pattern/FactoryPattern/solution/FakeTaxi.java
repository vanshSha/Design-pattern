package com.creational_design_pattern.FactoryPattern.solution;

// Concrete Products
public class FakeTaxi implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered by fake taxi");
    }
}
