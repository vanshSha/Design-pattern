package com.behavioural_design_pattern.StatePattern.solution;

public class Train implements TransportationMode{

    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA (Train)");
        return 3;
    }

    @Override
    public String getDirection() {
        return "Direction for Train";
    }
}
