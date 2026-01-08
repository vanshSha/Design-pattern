package com.structural_design_pattern.ProxyPattern.problem;

public class Client {
    public static void main(String[] args) {

        Image img1 = new RealImage("Hello.png");
        Image img2 = new RealImage("Hello.png");


    }
}
