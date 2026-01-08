package com.behavioural_design_pattern.StatePattern.solution;

public class Cycling implements TransportationMode{

    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA (Cycling)");
        return 5;
    }

    @Override
    public String getDirection() {
        return "Direction for cycling";
    }
}
