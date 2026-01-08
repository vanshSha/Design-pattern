package com.behavioural_design_pattern.StatePattern.problem;

public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService ds = new DirectionService(TransportationMode.WALKING);

        ds.setMode(TransportationMode.CAR);

        System.out.println(ds.getDirection());
        ds.getETA();
    }
}
/*
Problem is that : Complex Code , Tight Coupling
- Violation of Open/Closed Principle
 */
