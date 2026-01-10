package com.LLDProject.V2;

import java.util.ArrayList;
import java.util.List;

// Mediator ->  3 object Ride, Driver, Passenger
public class RideMatchingSystem {

    private List<Driver> availableDrivers = new ArrayList<>();

    //private Driver driver;

    public void addDriver(Driver driver) {
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy) {
        // base case
        if (availableDrivers.isEmpty()) {
            // System.out.println("No Drivers are unavailable");
            // mechanism to notify the passenger
            passenger.notify("No Drivers are unavailable");
            return;
        }
        // find the nearest driver available
        Driver nearestDriver = findNearestDriver(passenger.getLocation());

        // Mediator is responsible for 2 things
        availableDrivers.remove(nearestDriver);
        //passenger.notify("Ride schedule successfully " + nearestDriver);
        Ride ride = new Ride(passenger, nearestDriver, distance, fareStrategy);

        // Calc fair
        ride.calculateFare();


        // Change the Status of the Ride ?
        ride.updateStatus(RideStatus.ONGOING);  // observer design pattern
        passenger.notify("Ride scheduled with fare + RS " + ride.getFare());
        nearestDriver.notify("You have a new ride request for " + ride.getFare());


        // Change the Status after ride is finished
        ride.updateStatus(RideStatus.COMPLETED);  // observer design pattern
        availableDrivers.add(nearestDriver);


    }

    private Driver findNearestDriver(Location passengerLocation) {
        Driver assignedDriver = null;
        double minDist = Double.MAX_VALUE;
        for (Driver driver : availableDrivers) {
            double distance = driver.getLocation().calcDistance(passengerLocation);
            if (distance < minDist) {
                distance = distance;
                assignedDriver = driver;
            }
        }
        return assignedDriver;
    }
}
