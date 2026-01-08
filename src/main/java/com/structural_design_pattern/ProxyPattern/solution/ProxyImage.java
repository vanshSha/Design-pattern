package com.structural_design_pattern.ProxyPattern.solution;

// Proxy Image
public class ProxyImage implements Image {

    private String fileName; // proxy

    private RealImage realImage; // proxy image also hold the reference of real image

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName); // here image is loaded + cached
        }
        realImage.display();
    }
}
