package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class CristalBall extends Ball{
    public CristalBall(){
        setBounceBehavior(bounceBehavior);
       // bounceBehavior =  new NotBounce();
        deflateBehavior = new NotDeflatable();
        crashBehavior = new Crash();
        type = "Cristal ball";
    }
}
