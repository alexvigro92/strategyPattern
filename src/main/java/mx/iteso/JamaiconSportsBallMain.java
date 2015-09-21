package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotBounce;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball basquetBall = new BaseballBall();
        Ball tennisBall = new TennisBall();
        Ball volleyBall = new VolleyBallBall();
        Ball golfBalll = new GolfBall();
        Ball cristallBall = new CristalBall();


        System.out.println(soccer.roll());
        //System.out.println(soccer.performBounce());
        soccer.setBounceBehavior(new NormalBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());

        System.out.println();

        System.out.println(american.roll());
        //System.out.println(american.performBounce());
        american.setBounceBehavior(new IrregularBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.PerformCrash());
        System.out.println(american.performInflate());

        System.out.println();

        System.out.println(base.roll());
       // System.out.println(base.performBounce());
        base.setBounceBehavior(new IrregularBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.PerformCrash());
        System.out.println(base.performInflate());

        System.out.println();

        System.out.println(basquetBall.roll());
        //System.out.println(basquetBall.performBounce());
        basquetBall.setBounceBehavior(new NormalBounce());
        System.out.println(basquetBall.performDeflate());
        System.out.println(basquetBall.PerformCrash());
        System.out.println(basquetBall.performInflate());

        System.out.println();

        System.out.println(tennisBall.roll());
        //System.out.println(tennisBall.performBounce());
        tennisBall.setBounceBehavior(new NormalBounce());
        System.out.println(tennisBall.performDeflate());
        System.out.println(tennisBall.PerformCrash());
        System.out.println(tennisBall.performInflate());

        System.out.println();

        System.out.println(volleyBall.roll());
       // System.out.println(volleyBall.performBounce());
        volleyBall.setBounceBehavior(new NormalBounce());
        System.out.println(volleyBall.performDeflate());
        System.out.println(volleyBall.PerformCrash());
        System.out.println(volleyBall.performInflate());

        System.out.println();

        System.out.println(golfBalll.roll());
        //System.out.println(golfBalll.performBounce());
        golfBalll.setBounceBehavior(new NormalBounce());
        System.out.println(golfBalll.performDeflate());
        System.out.println(golfBalll.PerformCrash());
        System.out.println(golfBalll.performInflate());

        System.out.println();

        System.out.println(cristallBall.roll());
        //System.out.println(cristallBall.performBounce());
        cristallBall.setBounceBehavior(new NotBounce());
        System.out.println(cristallBall.performDeflate());
        System.out.println(cristallBall.PerformCrash());
        System.out.println(cristallBall.performInflate());
    }
}
