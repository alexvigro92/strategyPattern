package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class FoamFloatsTest {
    @Test
    public void foamFloatsTest(){
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I'm deflating!",foamFloats.performDeflate());
        assertEquals("I'm inflating!",foamFloats.performInflate());
        assertEquals("I'm floating!",foamFloats.PerformFloat());
        assertEquals("I'm a Foam Float!",foamFloats.display());
    }
}
