package com.creational_design_pattern.BuilderPattern.problem;

public class Main {
    // Constructor Explosion  ---> Too Many Constructor
    // Difficult to understand and maintain this code
     // Builder Pattern Simplify this issue
    public static void main(String[] args) {
        Home home = new Home("Concrete","Wood", "Bricks", true, false , true);
        System.out.println(home);


    }
}
