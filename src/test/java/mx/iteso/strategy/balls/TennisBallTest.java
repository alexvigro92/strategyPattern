package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class TennisBallTest {
    @Test
    public void TennisBallTest(){
        TennisBall tennisBall = new TennisBall();
        tennisBall.setBounceBehavior(new NormalBounce());
        assertEquals("I'm bouncing normally!",tennisBall.getbounceBehavior());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("I can't inflate!", tennisBall.performInflate());
        assertEquals("I can't crash!! I'm bouncing", tennisBall.PerformCrash());
        assertEquals("Tennis ball is rolling!", tennisBall.roll());
    }
}
