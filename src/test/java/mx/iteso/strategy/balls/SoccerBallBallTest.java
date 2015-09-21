package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class SoccerBallBallTest {
    @Test
    public void SoccerBallBallTest(){
        SoccerBall soccerBall = new SoccerBall();
        soccerBall.setBounceBehavior(new NormalBounce());
        assertEquals("I'm bouncing normally!",soccerBall.getbounceBehavior());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("I can't crash!! I'm bouncing", soccerBall.PerformCrash());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
