package com.company;

public class Main {

     
    public static void main(String[] args) {
        int numSlots = 6;

        ElectronicDevice sonyTV = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.TV);
        ElectronicDevice geFan = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.FAN);


        TurnDeviceOn onCommandT = new TurnDeviceOn(sonyTV);
        TurnDeviceOff offCommandT = new TurnDeviceOff(sonyTV);
        TurnDeviceOn onCommandF = new TurnDeviceOn(geFan);
        TurnDeviceOff offCommandF = new TurnDeviceOff(geFan);



        Command[] allOn = {onCommandT, onCommandF};
        Command[] allOff = {offCommandT, offCommandF};
        MacroCommand allOnMacro = new MacroCommand(allOn);
        MacroCommand allOffMacro = new MacroCommand(allOff);

        RemoteControl remote = new RemoteControl(numSlots);

        remote.setCommand(0, allOnMacro, allOffMacro);
        remote.setCommand(1, onCommandT, offCommandT);
        remote.setCommand(2, onCommandF, offCommandF);

        remote.pressOffButton(0);
        remote.pressOnButton(1);
        remote.pressOnButton(2);


        Jaccuzi jaccuzi = new Jaccuzi();


        JaccuziHighCommand jacuzzyhigh =
                new JaccuziHighCommand(jaccuzi);

        JacuzziOffCommand jacuuzyOff =
                new JacuzziOffCommand(jaccuzi);

        JacuzziMediumCommand jacuzzyMedium =
                new JacuzziMediumCommand(jaccuzi);

        JacuzziLowCommand jacuzzylow =
                new JacuzziLowCommand(jaccuzi);

        remote.setCommand(3, jacuuzyOff, jacuuzyOff);
        remote.setCommand(4, jacuzzyhigh, jacuzzyhigh);
        remote.setCommand(5, jacuzzylow, jacuzzylow);

        //jacuzzi turned from off to high
        remote.pressOnButton(3);
        remote.pressOnButton(4);

        //undone and back to off
        remote.pressUndo();

        // off to high to low to high
        remote.pressOnButton(3);
        remote.pressOnButton(4);
        remote.pressOffButton(5);
        remote.pressOnButton(4);

        //off to high to low to high
        remote.pressUndo();

    }
}