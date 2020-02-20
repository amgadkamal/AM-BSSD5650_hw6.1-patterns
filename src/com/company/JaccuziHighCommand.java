package com.company;

public class JaccuziHighCommand implements Command {
        Jaccuzi jaccuzi;
        int prevSpeed;

        public JaccuziHighCommand (Jaccuzi jaccuzi) {
            this.jaccuzi = jaccuzi;
        }
        public void execute() {
            prevSpeed = jaccuzi.getSpeed();
            jaccuzi.high();


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
