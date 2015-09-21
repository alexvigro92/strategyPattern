package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFloating;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class LifesaversCandies extends Lifesaver {
    public LifesaversCandies() {
        deflateBehavior = new NotDeflatable();
        flotationBehavior = new NotFloating();
        type = "Lifesaver Candy!";
    }
}
