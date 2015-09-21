package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotCrash;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class TennisBall extends Ball {
    public TennisBall(){
        setBounceBehavior(bounceBehavior);
        //bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        crashBehavior = new NotCrash();
        type = "Tennis ball";
    }
}
