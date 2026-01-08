package com.behavioural_design_pattern.StatePattern.solution;

// Context
public class DirectionService {

    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode){
        this.transportationMode = transportationMode;
    }

    public void setTransportationMode(TransportationMode mode){
        this.transportationMode = mode;
    }

    // delegating the work current state's concrete class
    public int getETA(){
     return transportationMode.calculateETA();
    }

    public String getDirection(){
        return transportationMode.getDirection();
    }

}
