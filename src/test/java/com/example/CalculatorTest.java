package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

import static org.junit.Assert.assertEquals;

public class CalculatorTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(Calculator.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        final String responseMsg = target()
                .path("calc")
                .path("add")
                .path("10000")
                .path("10000")
                .request().get(String.class);

        assertEquals("20000", responseMsg);
    }
}
