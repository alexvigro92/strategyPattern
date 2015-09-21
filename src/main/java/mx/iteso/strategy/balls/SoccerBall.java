package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotCrash;

public class SoccerBall extends Ball {
    public SoccerBall() {
        setBounceBehavior(bounceBehavior);
      //  bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        crashBehavior = new NotCrash();
        type = "Soccer ball";
    }
}
