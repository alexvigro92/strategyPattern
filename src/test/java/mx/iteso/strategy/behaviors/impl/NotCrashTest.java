package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class NotCrashTest {

    @Test
    public void NotCrashTest(){
        NotCrash notCrash = new NotCrash();
        assertEquals("I can't crash!! I'm bouncing", notCrash.crash());
    }
}
