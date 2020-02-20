package com.company;


public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(int numDevices) {
        onCommands = new Command[numDevices];
        offCommands = new Command[numDevices];

        Command emptyCommand = new EmptyCommand();
        for (int i = 0; i < numDevices; i++) {
            onCommands[i] = emptyCommand;
            offCommands[i] = emptyCommand;
        }
        undoCommand = emptyCommand;
    }

    public void setCommand (int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pressUndo() {
        undoCommand.undo();
    }

    public void pressAllOns() {
        //undoCommand.undo();
    }


}
