package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class NotFloatingTest {
    @Test
    public void notFloatingTest(){
        NotFloating notFloating = new NotFloating();
        assertEquals("I'm not floating!",notFloating.floating());
    }
}
