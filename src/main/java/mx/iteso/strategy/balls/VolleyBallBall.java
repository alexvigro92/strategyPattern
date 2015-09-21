package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotCrash;

public class VolleyBallBall extends Ball{
    public VolleyBallBall(){
        setBounceBehavior(bounceBehavior);
        //bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        crashBehavior = new NotCrash();
        type = "Volleyball ball";
    }
}
