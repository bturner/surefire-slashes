package org.example.surefire;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testGetGreeting() {
        assertEquals("Hello, World!", new Example().getGreeting());
    }
}

