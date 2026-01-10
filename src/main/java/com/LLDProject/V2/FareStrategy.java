package com.LLDProject.V2;

public interface FareStrategy {

    double calcFare(Vehicle vehicle, double distance);
}

class StandardFareStrategy implements FareStrategy {

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance;
    }

}

class SharedFareStrategy implements FareStrategy {

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance*.50;
    }

}

class LuxuryFareStrategy implements FareStrategy {

    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        // additional charge 1.50
        return vehicle.getFarePerKm() * distance*1.50;
    }

}
