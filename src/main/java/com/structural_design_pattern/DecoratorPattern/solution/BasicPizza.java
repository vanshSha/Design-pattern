package com.structural_design_pattern.DecoratorPattern.solution;

// ConcreteComponent
public class BasicPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5.00; // base cost of any pizza
    }
}
