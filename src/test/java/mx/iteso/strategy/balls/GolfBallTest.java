package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class GolfBallTest {
    @Test
    public void GolfBallTest(){
        GolfBall golfBall = new GolfBall();
        golfBall.setBounceBehavior(new NormalBounce());
        assertEquals("I'm bouncing normally!",golfBall.getbounceBehavior());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("I can't crash!! I'm bouncing", golfBall.PerformCrash());
        assertEquals("Golf ball is rolling!", golfBall.roll());
    }
}
