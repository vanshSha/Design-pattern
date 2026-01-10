package com.LLDProject.V2;


import lombok.AllArgsConstructor;

public class Ride {

    private Passenger passenger;
    private Driver driver;
    private double distance;
    private FareStrategy fareStrategy;
    private double fare;
    private RideStatus status;

    public Ride(Passenger passenger,
                Driver driver,
                double distance,
                FareStrategy fareStrategy
                ) {

        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStrategy = fareStrategy;
//        this.fare = calculateFare();
        this.status = RideStatus.SCHEDULED;
    }

    public void calculateFare() {
        this.fare = fareStrategy.calcFare(driver.getVehicle(), distance);
    }

    public void updateStatus(RideStatus status) {
        this.status = status;
        notifyUsers(status);
    }

    private void notifyUsers(RideStatus status) {
        passenger.notify("Your ride is " + status);
        driver.notify("Ride status: " + status);
    }

    public double getFare(){
        return fare;
    }
}

enum RideStatus {

        PENDING, ONGOING, COMPLETED, SCHEDULED;

}
