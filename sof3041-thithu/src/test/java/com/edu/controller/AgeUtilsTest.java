package com.edu.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgeUtilsTest {

    AgeUtils ageUtils;

    @BeforeEach
    public void setUp() {
        ageUtils = new AgeUtils();
    }

    // Tuổi nhỏ hơn giới hạn dưới
    @Test
    void testUnderRangeAge() {
        assertFalse(ageUtils.isValidAge(16));
    }

    // Tuổi nhỏ nhất hợp lệ
    @Test
    void testMinimumAge() {
        assertTrue(ageUtils.isValidAge(18));
    }

    // Tuổi lớn nhất hợp lệ
    @Test
    void testMaximumAge() {
        assertTrue(ageUtils.isValidAge(60));
    }

    // Tuổi lớn hơn giới hạn trên
    @Test
    void testAboveRangeAge() {
        assertFalse(ageUtils.isValidAge(63));
    }

    // Một tuổi hợp lệ trung bình (18 + 60) / 2 = 39
    @Test
    void testAverageAge() {
        assertTrue(ageUtils.isValidAge(39));
    }

    // Một tuổi hợp lệ khác
    @Test
    void testValidAge() {
        assertTrue(ageUtils.isValidAge(29));
    }

    // Tuổi âm
    @Test
    void testNegativeAge() {
        assertFalse(ageUtils.isValidAge(-18));
    }

    // Tuổi rất lớn
    @Test
    void testVeryLargeAge() {
        assertFalse(ageUtils.isValidAge(999999999));
    }

    // Tuổi là 0
    @Test
    void testZeroAge() {
        assertFalse(ageUtils.isValidAge(0));
    }

    // Tuổi là 59
    @Test
    void testAt59() {
        assertTrue(ageUtils.isValidAge(59));
    }

}
