package com.LLDProject.V2;

public class Client {
    public static void main(String[] args) {

        Location loc1 = new Location(12.88, 13.88);
        Location loc2 = new Location(91.00, 82.00);
        Location loc3 = new Location(32.99, 33.99);


        // Create Vehicle
        Vehicle car = new Car("up30 9999");
        Vehicle bike = new Bike("up31 1111");

        // Create Driver
        Driver driver1 = new Driver("Mac", "mac@123", loc1, car);
        Driver driver2 = new Driver("Boob", "boob@123l", loc2, car);
        Driver driver3 = new Driver("Jaamm", "jaamm@123l", loc3, bike);

        Passenger passenger1 = new Passenger("John", "john@123", loc1);


        RideMatchingSystem rideMatchingSystem = new RideMatchingSystem();
        rideMatchingSystem.addDriver(driver1);
        rideMatchingSystem.addDriver(driver2);
        rideMatchingSystem.addDriver(driver3);


        rideMatchingSystem.requestRide(passenger1, 10, new StandardFareStrategy());


    }
}
