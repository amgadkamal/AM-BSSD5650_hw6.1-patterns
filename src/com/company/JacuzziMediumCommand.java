package com.company;

public class JacuzziMediumCommand implements Command {

    Jaccuzi jaccuzi;
    int prevSpeed;

    public JacuzziMediumCommand (Jaccuzi jaccuzi) {
        this.jaccuzi = jaccuzi;
    }

    public JacuzziMediumCommand(int medium) {
    }


    public void execute() {
        prevSpeed = jaccuzi.getSpeed();
        jaccuzi.medium();
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


