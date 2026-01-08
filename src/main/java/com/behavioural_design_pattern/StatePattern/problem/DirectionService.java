package com.behavioural_design_pattern.StatePattern.problem;

public class DirectionService {

    private TransportationMode mode;

    public DirectionService(TransportationMode mode) {
        this.mode = mode;
    }

    public void setMode(TransportationMode mode) {
        this.mode = mode;
    }

    public String getDirection(){
        switch(mode){
            case WALKING :
                return "Direction for walking: Head north for 500 meter";
            case CYCLING :
                return "Direction for cycling: Take the bike lane on Elm Street";
            case CAR :
                return "Direction for driving: Use highway 50 towards downtown";
            case TRAIN :
                return "Direction for train: Board the Red Line at Central Station";
            default :
                return "No direction available for the selected mode";
        }
    }

    // Method to Calculate ETA based upon transportation Mode
    public int getETA() {
        switch (mode) {
            case WALKING:
                System.out.println("Calculating ETA for walking 10");
                return 10;
            case CYCLING:
                System.out.println("Calculating ETA for cycling 5");
                return 5;
            case CAR:
                System.out.println("Calculating ETA for car 2 ");
                return 2;
            case TRAIN:
                System.out.println("Calculating ETA for train 3 ");
                return 3;
            default:
                throw new IllegalArgumentException("Unknown Mode");
        }

    }

}


enum TransportationMode {

    WALKING, CYCLING, CAR, TRAIN

}