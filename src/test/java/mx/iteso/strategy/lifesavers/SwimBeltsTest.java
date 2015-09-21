package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class SwimBeltsTest {
    @Test
    public void swimBeltsTest(){
        SwimBelts swimBelts = new SwimBelts();
        assertEquals("I'm deflating!",swimBelts.performDeflate());
        assertEquals("I'm inflating!",swimBelts.performInflate());
        assertEquals("I'm floating!",swimBelts.PerformFloat());
        assertEquals("I'm a Swim Belt!",swimBelts.display());

    }
}
