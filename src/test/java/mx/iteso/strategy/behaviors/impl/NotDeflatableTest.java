package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class NotDeflatableTest {
    @Test
    public void NotDeflatableTest(){
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't deflate!", notDeflatable.deflate());
    }
    @Test
    public void NotInflatableTest(){
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't inflate!", notDeflatable.inflate());
    }
}
