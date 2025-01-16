package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testIsEventNumber2() {
        App app = new App();
        boolean expected = app.isEventNumber(2);
        boolean actual = true;
        assertEquals(expected, actual);
    }

    @Test
    void testIsEventNumber3() {
        App app = new App();
        boolean expected = app.isEventNumber(3);
        boolean actual = false;
        assertEquals(expected, actual);
    }

    @Test
    void testIsEventNumber4() {
        App app = new App();
        boolean expected = app.isEventNumber(4);
        boolean actual = true;
        assertEquals(expected, actual);
    }

    // @Test
    // void testMain() {

    // }
}
