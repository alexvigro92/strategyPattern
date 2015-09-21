package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class SwimRingTest {
    @Test
    public void swimRingTest(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm deflating!",swimRing.performDeflate());
        assertEquals("I'm inflating!",swimRing.performInflate());
        assertEquals("I'm floating!",swimRing.PerformFloat());
        assertEquals("I'm a Swim Ring!",swimRing.display());

    }
}
