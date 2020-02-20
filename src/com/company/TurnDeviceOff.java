package com.company;


public class TurnDeviceOff implements Command {

    ElectronicDevice theDevice;

    public TurnDeviceOff(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
