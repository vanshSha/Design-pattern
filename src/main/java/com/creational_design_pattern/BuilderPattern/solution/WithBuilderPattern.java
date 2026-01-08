package com.creational_design_pattern.BuilderPattern.solution;

import com.creational_design_pattern.BuilderPattern.problem.Home;

public class WithBuilderPattern {
    public static void main(String[] args) {

        House home = new House.HomeBuilder("Concrete", "Wood", "Tile")
                // whatever I set this stuff this is optionally and I can change any order
                .setGarden(true) // return HouseBuilder
//                .setSwimmingPool(true)  // return HouseBuilder
                .setGarage(false)  // return HouseBuilder
                .build();  // <--- Last method in the change

        System.out.println(home);
    }
}
