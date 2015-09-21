package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class GolfBall extends Ball {
    public GolfBall(){
        setBounceBehavior(bounceBehavior);
        //bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        crashBehavior = new NotCrash();
        type = "Golf ball";
    }
}
