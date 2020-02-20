package com.company;

public class JacuzziOffCommand implements Command {
    Jaccuzi jaccuzi;
    int prevSpeed;

    public JacuzziOffCommand (Jaccuzi jaccuzi) {
        this.jaccuzi = jaccuzi;
    }

    public JacuzziOffCommand() {

    }

    public void execute() {
        prevSpeed = jaccuzi.getSpeed();
        jaccuzi.off();

    }
    public void undo() {
        if (prevSpeed == Jaccuzi.HIGH) {
            jaccuzi.high();
        } else if (prevSpeed == Jaccuzi.MEDIUM) {
            jaccuzi.medium();
        } else if (prevSpeed == Jaccuzi.LOW) {
            jaccuzi.low();
        } else if (prevSpeed == Jaccuzi.OFF) {
            jaccuzi.off();
        }
    }
}

