package com.creational_design_pattern.FactoryPattern.problem;

public class Car implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered by Car");
    }
}
