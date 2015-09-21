package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class NormalBounceTest {
    @Test
    public void NormalBounceTest(){
        NormalBounce normalBounce = new NormalBounce();
        assertEquals("I'm bouncing normally!", normalBounce.bounce());
    }
}
