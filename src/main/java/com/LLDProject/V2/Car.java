package com.LLDProject.V2;

import org.springframework.beans.factory.annotation.Value;

public class Car extends Vehicle {

    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double getFarePerKm() {
        return 20;
    }
}
