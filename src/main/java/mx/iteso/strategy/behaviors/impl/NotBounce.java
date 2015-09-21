package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class NotBounce implements BounceBehavior {
    public String bounce() {
        return "I can't bounce!";
    }
}
