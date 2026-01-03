package com.designpattern.ObserverPattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        // Create a Publisher
        WeatherStation1 weatherStation = new WeatherStation1();

        // Create Subscriber
        Display device = new Display("SamsungLCD");
        MobileDisplay md = new MobileDisplay();

        // attach
        weatherStation.attach(device);
        weatherStation.attach(md);

        // set temp
        weatherStation.setTemperature(13);

        // detach temp
        weatherStation.detach(md);

        weatherStation.setTemperature(12);



    }
}

// Observer = I have 2 Subscriber
interface Observer {
    void update(float temp);
}

@AllArgsConstructor
//Subscriber
class Display implements Observer {

    private String name;

    @Override
    public void update(float temp) {
        System.out.println("Temp on " + name + " device is " + temp);
    }
}

//Subscriber
class MobileDisplay implements Observer {

    @Override
    public void update(float temp) {
        System.out.println("Temp on Mobile is " + temp);
    }
}

// Subject  = Channel is the object that maintains state and notifies all registered observers whenever that state changes.
interface Subject {

    void attach(Observer obs);

    void detach(Observer obs);

    void notifyObserver();

}

@AllArgsConstructor
@NoArgsConstructor
class WeatherStation1 implements Subject {

    private float temperature;

    private List<Observer> observerList = new ArrayList<>();


    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer obs : observerList) {
            obs.update(temperature);
        }
    }
}
