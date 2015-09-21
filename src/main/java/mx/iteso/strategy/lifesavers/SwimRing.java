package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floating;

public class SwimRing extends Lifesaver {
    public SwimRing() {
        deflateBehavior = new Deflatable();
        flotationBehavior = new Floating();
        type = "Swim Ring!";
    }
}
