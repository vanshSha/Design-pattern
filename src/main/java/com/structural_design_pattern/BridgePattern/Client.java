package com.structural_design_pattern.BridgePattern;

public class Client {
    public static void main(String[] args) {

        Device radio = new Radio();
        Device ac = new AC();
        Device tv = new TV();

        Remote basicRemoteTV = new BasicRemote(tv);
        System.out.println("Basic Remote controlling TV");
        basicRemoteTV.powerOn();
        basicRemoteTV.volumeUp();
        basicRemoteTV.volumeUp();
        basicRemoteTV.volumeDown();
        basicRemoteTV.mute();
        basicRemoteTV.powerOf();
        System.out.println();

        Remote basicRemoteRadio = new BasicRemote(radio);
        basicRemoteRadio.powerOn();
        basicRemoteRadio.volumeUp();
        basicRemoteRadio.volumeDown();
        basicRemoteRadio.powerOf();
        System.out.println();

        AdvanceRemote advancedRemoteTV = new AdvanceRemote(tv);
        System.out.println("Advanced Remote controlling TV");
        advancedRemoteTV.powerOn();
        advancedRemoteTV.volumeUp();
        advancedRemoteTV.volumeUp();
        advancedRemoteTV.mute();
        advancedRemoteTV.displayStatus();
        advancedRemoteTV.unmute();
        advancedRemoteTV.powerOf();
        System.out.println();

        AdvanceRemote advancedRemoteAC = new AdvanceRemote(ac);
        System.out.println("Advanced Remote controlling AC");
        advancedRemoteAC.powerOn();
        advancedRemoteAC.volumeUp();
        advancedRemoteAC.volumeUp();
        advancedRemoteAC.displayStatus();
        advancedRemoteAC.volumeDown();
        advancedRemoteAC.powerOf();
        System.out.println();

        System.out.println("Runtime Flexibility: Switching Device");
        Device freshTV = new TV();
        Device freshRadio = new Radio();
        Device freshAC = new AC();

        Remote remote = new BasicRemote(freshTV);
        remote.powerOn();
        remote.volumeUp();

        remote.setDevice(freshRadio);
        remote.powerOn();
        remote.volumeUp();

        remote.setDevice(freshAC);
        remote.powerOn();
        remote.volumeUp();
        System.out.println();

    }
}
