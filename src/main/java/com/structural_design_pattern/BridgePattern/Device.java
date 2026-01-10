package com.structural_design_pattern.BridgePattern;

// Implementor
public interface Device {

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    void mute();
    boolean isPoweredOn();
    int getVolume();

}
