package com.structural_design_pattern.DecoratorPattern.solution;


public class PizzaApp {
    public static void main(String[] args) {
        // Start from Basic Pizza
        Pizza pizza = new BasicPizza();


        // add Cheese
        pizza = new CheeseDecorator(pizza);
        // add extra cheese and olive
        pizza = new CheeseOliveDecorator(pizza);
        // add Mushroom
        pizza = new MushRoomDecorator(pizza);
        // veggie
        pizza = new VeggieDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());


    }
}
/*
            This code fix - Scalability , flexibility
            - Single Responsibility Principle - Open Closed
            - More Dynamic
            _ Combinatorial Freedom
 */
