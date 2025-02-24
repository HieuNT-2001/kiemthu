package com.poly.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    // Test case number = 6
    @Test
    void testIsEven1() {
        assertTrue(NumberUtils.isEven(6));
    }

    // Test case number = 7
    @Test
    void testIsEven2() {
        assertFalse(NumberUtils.isEven(7));
    }

    // Test case number = 0
    @Test
    void testIsEven3() {
        assertTrue(NumberUtils.isEven(0));
    }

    // Test case number = -4
    @Test
    void testIsEven4() {
        assertTrue(NumberUtils.isEven(-4));
    }

    // Test case number = -3
    @Test
    void testIsEven5() {
        assertFalse(NumberUtils.isEven(-3));
    }
}
