package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 9/17/2015.
 */
public class NotBounceTest {

    @Test
    public void NotBounceTest(){
        NotBounce notBounce = new NotBounce();
        assertEquals("I can't bounce!", notBounce.bounce());
    }
}
