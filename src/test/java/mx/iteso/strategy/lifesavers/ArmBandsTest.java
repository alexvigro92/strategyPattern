package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class ArmBandsTest {
    @Test
    public void armBandsTest(){
        ArmBands armBands = new ArmBands();
        assertEquals("I'm deflating!",armBands.performDeflate());
        assertEquals("I'm inflating!",armBands.performInflate());
        assertEquals("I'm floating!",armBands.PerformFloat());
        assertEquals("I'm a Arm Band!",armBands.display());
    }
}
