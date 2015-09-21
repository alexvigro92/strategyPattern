package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseballBallTest {
    @Test
    public void testBaseballBallTest() {
        BaseballBall baseballBall = new  BaseballBall();
        baseballBall.setBounceBehavior(new IrregularBounce());
        assertEquals("I'm bouncing irregularly!", baseballBall.getbounceBehavior());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("I can't crash!! I'm bouncing", baseballBall.PerformCrash());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
    }

}
