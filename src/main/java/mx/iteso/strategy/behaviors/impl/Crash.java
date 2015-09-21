package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.CrashBehavior;

public class Crash implements CrashBehavior {

    public String crash() {
        return "I crashed!! I can't bounce";
    }

}
