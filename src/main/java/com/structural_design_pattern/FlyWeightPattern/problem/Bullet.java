package com.structural_design_pattern.FlyWeightPattern.problem;

public class Bullet {

    // Intrinsic property shared by all
    private String color;

    // Extrinsic properties unique to each bullet
    private int x, y;

    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + "," + y + ") with velocity" + " " + velocity);
    }

    public void display() {
        System.out.println("Bullet at (" + x + " , " + y + ") moving at velocity " + velocity);
    }


}
