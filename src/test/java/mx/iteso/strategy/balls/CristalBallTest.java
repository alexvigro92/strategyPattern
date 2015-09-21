package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.NotBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class CristalBallTest {
    @Test
    public void CristalBallTest() {
        CristalBall cristallBall = new CristalBall();
        cristallBall.setBounceBehavior(new NotBounce());
        assertEquals("I can't bounce!", cristallBall.getbounceBehavior());
        assertEquals("I can't deflate!", cristallBall.performDeflate());
        assertEquals("I can't inflate!", cristallBall.performInflate());
        assertEquals("I crashed!! I can't bounce", cristallBall.PerformCrash());
        assertEquals("Cristal ball is rolling!", cristallBall.roll());
    }
}
