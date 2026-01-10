package com.LLDProject.V1;

public class Main {
    public static void main(String[] args) {

        Location loc1 = new Location(12.88, 13.88);
        Location loc2 = new Location(91.00, 82.00);
        Location loc3 = new Location(32.99, 33.99);


        // Create Vehicle
        Vehicle car = new Vehicle("up30 9999", "LandRover");
        Vehicle bike = new Vehicle("up31 1111", "GT-650");

        // Create Driver
        Driver driver1 = new Driver("Mac", loc1, car);
        Driver driver2 = new Driver("Boob", loc2, car);
        Driver driver3 = new Driver("Jaamm", loc3, bike);

        // Create Passengers
        Passenger passenger1 = new Passenger("John", loc2);
        Passenger passenger2 = new Passenger("Rahul", loc3);
        Passenger passenger3 = new Passenger("SE", loc1);


        // Test Ride Sharing
        RideSharingAppService appService = new RideSharingAppService();
        // here I will add driver
        appService.addDriver(driver1);
        appService.addDriver(driver2);
        appService.addDriver(driver3);

        // Add passenger
        appService.addPassenger(passenger1);
        appService.addPassenger(passenger2);
        appService.addPassenger(passenger3 );

        // Book the Ride
        appService.bookRide(passenger1 , 20);
        appService.bookRide(passenger2, 30);




    }
}
