package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class LifesaversCandiesTest {
    @Test
    public void LifesaversCandiesTest(){
        LifesaversCandies lifesaversCandies = new LifesaversCandies();
        assertEquals("I can't deflate!",lifesaversCandies.performDeflate());
        assertEquals("I can't inflate!",lifesaversCandies.performInflate());
        assertEquals("I can't float!",lifesaversCandies.PerformFloat());
        assertEquals("I'm a Lifesaver Candy!",lifesaversCandies.display());
    }
}