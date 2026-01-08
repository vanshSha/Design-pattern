package com.structural_design_pattern.DecoratorPattern.solution;

public class VeggieDecorator extends PizzaDecorator{

    public VeggieDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Veggie";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.50;
    }
}
