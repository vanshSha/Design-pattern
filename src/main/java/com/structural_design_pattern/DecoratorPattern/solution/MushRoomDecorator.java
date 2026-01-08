package com.structural_design_pattern.DecoratorPattern.solution;

public class MushRoomDecorator extends PizzaDecorator{

    public MushRoomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", MushRoom";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.50;
    }
}
