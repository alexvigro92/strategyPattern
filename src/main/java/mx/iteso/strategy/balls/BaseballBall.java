package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotCrash;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BaseballBall extends Ball {
    public BaseballBall() {
        setBounceBehavior(bounceBehavior);
       // bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        crashBehavior = new NotCrash();
        type = "Baseball ball";
    }
}
