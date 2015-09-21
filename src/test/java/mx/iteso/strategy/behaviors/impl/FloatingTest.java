package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class FloatingTest {
    @Test
    public void floatingTest(){
        Floating floating = new Floating();
        assertEquals("I'm floating!",floating.floating());
    }


}
