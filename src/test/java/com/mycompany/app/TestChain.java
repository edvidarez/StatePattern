package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 19/11/2016.
 */
public class TestChain {
    private Chain cellphone;
    private State state;

    @Before
    public void setup() {
        state = new Off();
        cellphone = new Chain();
    }

    @Test
    public void testPullChain() {
        cellphone.set_state(state);
        assertEquals("Off", cellphone.use());
        assertEquals("Charging", cellphone.use());
        assertEquals("On", cellphone.use());
        assertEquals("Using", cellphone.use());
        assertEquals("Discharging", cellphone.use());
    }
}
