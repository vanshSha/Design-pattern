package com.creational_design_pattern.FactoryPattern.problem;

public class Bus implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered by Bus");
    }
}
