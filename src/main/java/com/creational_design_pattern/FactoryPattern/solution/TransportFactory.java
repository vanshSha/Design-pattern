package com.creational_design_pattern.FactoryPattern.solution;

// Factory
public class TransportFactory {

    public static Transport createTransport(String type){
        switch (type.toLowerCase()){
            case "car" :
                return new Car();
            case "bike" :
                return new Bike();
            case "bus" :
                return new Bus();
            case "fake taxi" :
                return new FakeTaxi();
            default :
                throw new IllegalArgumentException("Unsupported transport type");
        }
    }
}
