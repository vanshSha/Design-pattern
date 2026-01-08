package com.structural_design_pattern.DecoratorPattern.solution;

// Decorator (Abstract Wrapper)
abstract class PizzaDecorator implements Pizza{

    protected Pizza decoratorPizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratorPizza = pizza;
    }


    @Override
    public String getDescription() {
        return decoratorPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratorPizza.getCost();
    }
}
