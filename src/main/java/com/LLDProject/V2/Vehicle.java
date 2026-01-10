package com.LLDProject.V2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Vehicle {

    protected String numberPlate;

    // fare Calculation
    public abstract double getFarePerKm();

}
