package com.structural_design_pattern.FlyWeightPattern.solution;

public class Bullet {


    private BulletType type;

    // Extrinsic properties unique to each bullet
    private int x, y;

    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.type = BulletTypeFactory.getBulletType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + "," + y + ") with velocity" + " " + velocity);
    }

    public void display() {
        System.out.println("Bullet at (" + x + " , " + y + ") moving at velocity " + velocity);
    }


}
