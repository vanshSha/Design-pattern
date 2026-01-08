package com.behavioural_design_pattern.StatePattern.solution;

public class Car implements TransportationMode{

    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA (Car)");
        return 4;
    }

    @Override
    public String getDirection() {
        return "Direction for Car";
    }
}
