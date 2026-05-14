package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        helloWorld hw = new helloWorld();
        assertEquals("Hello, World!", hw.getMessage()); // Fixed expected string
    }
}
