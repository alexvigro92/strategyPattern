package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.CrashBehavior;

public class NotCrash implements CrashBehavior {

    public String crash() {
        return "I can't crash!! I'm bouncing";
    }

}

