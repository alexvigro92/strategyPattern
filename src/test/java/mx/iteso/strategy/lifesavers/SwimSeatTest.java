package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 9/19/2015.
 */
public class SwimSeatTest {
    @Test
    public void swimSeatTest(){
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm deflating!",swimSeat.performDeflate());
        assertEquals("I'm inflating!",swimSeat.performInflate());
        assertEquals("I'm floating!",swimSeat.PerformFloat());
        assertEquals("I'm a Swim Seat!",swimSeat.display());

    }
}
