package com.structural_design_pattern.ProxyPattern.solution;

// Client
public class Client {
    public static void main(String[] args) {

        Image img1 = new ProxyImage("Hello.png");
        Image img2 = new ProxyImage("Cat.png");

        img1.display(); // create + realImage + load + display
        img1.display(); // here this step it will be fast only --> display
    }
}
