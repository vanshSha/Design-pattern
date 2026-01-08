package com.behavioural_design_pattern.StatePattern.solution;

public class WithStatePattern {

    public static void main(String[] args) {
        DirectionService ds = new DirectionService(new Cycling());

       ds.setTransportationMode(new Car());
       ds.getETA();
       System.out.println(ds.getDirection());

    }
}
