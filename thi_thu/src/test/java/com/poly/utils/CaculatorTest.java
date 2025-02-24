package com.poly.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CaculatorTest {

    // Kiem tra ham voi 2 so duong
    @Test
    void testAdd1() {
        double a = 3;
        double b = 7;
        double expected = 10;
        double actual = Caculator.add(a, b);
        assertEquals(expected, actual);
    }

    // Kiem tra ham voi 2 so am
    @Test
    void testAdd2() {
        double a = -33;
        double b = -77;
        double expected = -110;
        double actual = Caculator.add(a, b);
        assertEquals(expected, actual);
    }

    // Kiem tra ham voi so am va so duong
    @Test
    void testAdd3() {
        double a = -33;
        double b = 7;
        double expected = -26;
        double actual = Caculator.add(a, b);
        assertEquals(expected, actual);
    }
}
