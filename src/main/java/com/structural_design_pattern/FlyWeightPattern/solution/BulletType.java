package com.structural_design_pattern.FlyWeightPattern.solution;

// Flyweight Class
public class BulletType {

    private String  color;// Intrinsic property shared by all bullets

    public BulletType(String color){
        this.color = color;
        System.out.println("Creating bulletType with color" + color);
    }

}
