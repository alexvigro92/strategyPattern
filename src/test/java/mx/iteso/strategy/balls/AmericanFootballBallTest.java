package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmericanFootballBallTest {
    @Test
    public void testAmericanFootballBall() {
        AmericanFootballBall americanFootballBall = new AmericanFootballBall();
        americanFootballBall.setBounceBehavior(new IrregularBounce());
        assertEquals("I'm bouncing irregularly!", americanFootballBall.getbounceBehavior());
        assertEquals("I'm deflating!", americanFootballBall.performDeflate());
        assertEquals("I'm inflating!", americanFootballBall.performInflate());
        assertEquals("I can't crash!! I'm bouncing", americanFootballBall.PerformCrash());
        assertEquals("American Football ball is rolling!", americanFootballBall.roll());
    }
}
