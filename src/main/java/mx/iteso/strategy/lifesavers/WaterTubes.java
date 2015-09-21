package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floating;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class WaterTubes extends Lifesaver {
    public WaterTubes() {
        deflateBehavior = new Deflatable();
        flotationBehavior = new Floating();
        type = "Water Tube!";
    }
}
