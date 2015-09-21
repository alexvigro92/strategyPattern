package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class VolleyBallBallTest {
    @Test
    public void VolleyBallBallTest(){
        VolleyBallBall volleyBallBall = new VolleyBallBall();
        volleyBallBall.setBounceBehavior(new NormalBounce());
        assertEquals("I'm bouncing normally!",volleyBallBall.getbounceBehavior());
        assertEquals("I'm deflating!", volleyBallBall.performDeflate());
        assertEquals("I'm inflating!", volleyBallBall.performInflate());
        assertEquals("I can't crash!! I'm bouncing", volleyBallBall.PerformCrash());
        assertEquals("Volleyball ball is rolling!", volleyBallBall.roll());
    }
}
