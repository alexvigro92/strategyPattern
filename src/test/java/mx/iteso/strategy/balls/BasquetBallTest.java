package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class BasquetBallTest {
    @Test
    public void BasequeBallTest(){
        BasquetBallBall basquetBallBall = new BasquetBallBall();
        basquetBallBall.setBounceBehavior(new NormalBounce());
        assertEquals("I'm bouncing normally!", basquetBallBall.getbounceBehavior());
        assertEquals("I'm deflating!", basquetBallBall.performDeflate());
        assertEquals("I'm inflating!", basquetBallBall.performInflate());
        assertEquals("I can't crash!! I'm bouncing", basquetBallBall.PerformCrash());
        assertEquals("BasquetBall ball is rolling!", basquetBallBall.roll());
    }
}
