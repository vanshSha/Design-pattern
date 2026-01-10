package com.structural_design_pattern.BridgePattern;

// Abstraction - what clients can do
public abstract class Remote {

    protected Device device;

    public Remote(Device device){
        this.device = device;
    }

    public abstract void powerOn();
    public abstract void powerOf();
    public abstract void volumeUp();
    public abstract void volumeDown();
    public abstract void mute();

    // getSimpleName i will study later
    public void setDevice(Device device){
        this.device = device;
        System.out.println("Device changed to:" + device.getClass().getSimpleName());
    }

    public Device getDevice(){
        return device;
    }
}
