package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotCrash;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class BasquetBallBall extends Ball {
    public BasquetBallBall(){
        setBounceBehavior(bounceBehavior);
        // bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        crashBehavior = new NotCrash();
        type = "BasquetBall ball";
    }
}
