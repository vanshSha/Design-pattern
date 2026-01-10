package com.LLDProject.V1;

import java.util.ArrayList;
import java.util.List;

public class RideSharingAppService {

    // Matching Service . I am storing list of driver and passengers

    private List<Driver> drivers = new ArrayList<>();

    private List<Passenger> passengers = new ArrayList<>();

    // method to add passengers and driver

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    // Booking Ride
    public void bookRide(Passenger passenger, double distance) {
        // corner case like no driver is available
        if (drivers.isEmpty()) {
            System.out.println("No drivers are available for " + passenger.getName());
            return;
        }
        //  first find nearest driver
        Driver assignedDriver = null;
        double minDistance = Double.MAX_VALUE;

        for (Driver driver : drivers) {
            double currentDriverDistance = calcDistance(passenger.getLocation(), driver.getLocation());
            if (currentDriverDistance < minDistance) {
                minDistance = currentDriverDistance;
                assignedDriver = driver;
            }
        }
        // Fare Calculation
        double expectedFair = calcFair(assignedDriver.getVehicle(), distance);

        // Temporarily Block the Driver . Here I will track the driver state - Booked / Available



        // Show the driver and fare to the passengers
        System.out.println("Ride booked for " + passenger.getName() +
                " with driver name " + assignedDriver.getName() + " for a fare of " + expectedFair);
        System.out.println("Your Driver on the way " + assignedDriver.getName());
    }

    private double calcDistance(Location one, Location two) {
        // Euclidean Distance I will use this
        // Haversine formula (Two Point on sphere) I will use this
        double dx = one.getLatitude() - two.getLatitude();
        double dy = one.getLongitude() - two.getLongitude();
        return Math.sqrt(dx * dx + dy * dy);
    }

    private double calcFair(Vehicle vehicle, double distance) {
        if (vehicle.getType().equals("Car")) {
            return distance * 20; // per kim 20
        } else if (vehicle.getType().equals("Bike")) {
            return distance * 15;
        } else {
            return distance * 8;
        }
    }

}
