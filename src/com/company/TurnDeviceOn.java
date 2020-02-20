package com.company;
public class TurnDeviceOn implements Command {

    ElectronicDevice theDevice;

    public TurnDeviceOn(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
