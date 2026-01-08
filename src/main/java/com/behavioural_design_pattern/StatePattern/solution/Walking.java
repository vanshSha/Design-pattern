package com.behavioural_design_pattern.StatePattern.solution;

public class Walking implements TransportationMode{

    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA (Walking)");
        return 10; // Example ETA for walking
    }

    @Override
    public String getDirection() {
        return "Direction for walking";
    }
}
