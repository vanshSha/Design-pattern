package com.structural_design_pattern.DecoratorPattern.solution;

// ConcreteDecorator
public class CheeseOliveDecorator extends PizzaDecorator {

    public CheeseOliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese Olive";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.00;
    }
}
