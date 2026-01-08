package com.structural_design_pattern.DecoratorPattern.problem;

public class PizzaApp {
    public static void main(String[] args) {

        Pizza pizza = new CheeseOlivePizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }
}

/*
            1st Problem - Scalability because of there are so many class combination
            they may be lead class explosion .
            2nd Problem - Each new combination adding new code
            3rd Problem - Maintainability
 */