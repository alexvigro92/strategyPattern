package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class WaterTubesTest {
    @Test
    public void waterTubesTest(){
        WaterTubes waterTubes = new WaterTubes();
        assertEquals("I'm deflating!",waterTubes.performDeflate());
        assertEquals("I'm inflating!",waterTubes.performInflate());
        assertEquals("I'm floating!",waterTubes.PerformFloat());
        assertEquals("I'm a Water Tube!",waterTubes.display());

    }
}
