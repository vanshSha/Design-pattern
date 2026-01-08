package com.structural_design_pattern.ProxyPattern.problem;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadingImageFromDisk(); // Expensive Operation
    }

    public void loadingImageFromDisk(){
        System.out.println("Loading Image from disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying : " + fileName);
    }
}
