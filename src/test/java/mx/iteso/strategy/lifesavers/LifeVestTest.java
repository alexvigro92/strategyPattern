package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class LifeVestTest {
    @Test
    public void lifeVestTest(){
        LifeVest lifeVest = new LifeVest();
        assertEquals("I'm deflating!",lifeVest.performDeflate());
        assertEquals("I'm inflating!",lifeVest.performInflate());
        assertEquals("I'm floating!",lifeVest.PerformFloat());
        assertEquals("I'm a Life Vest!",lifeVest.display());

    }
}
