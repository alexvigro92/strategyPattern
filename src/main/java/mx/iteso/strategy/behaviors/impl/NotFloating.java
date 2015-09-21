package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationBehavior;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class NotFloating implements FlotationBehavior{
    public String floating() {
        return "I can't float!";
    }
}
