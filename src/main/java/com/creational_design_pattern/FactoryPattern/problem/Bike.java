package com.creational_design_pattern.FactoryPattern.problem;

public class Bike implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by Bike");
    }
}
