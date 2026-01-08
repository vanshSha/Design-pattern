package com.structural_design_pattern.FlyWeightPattern.solution;


public class Game {
    public static void main(String[] args) {
        // 5 Red Bullet Objects
        for (int a = 0; a < 10; a++) {
            Bullet bullet = new Bullet("red",a * 10, a * 12, 5);
        }

        // 5 Green Bullet Objects
        for (int a = 0; a < 10; a++) {
            Bullet bullet = new Bullet("red",a * 10, a * 12, 5);
        }
    }
}

/*
Problem memory overhead  -
Slow Performance

 */