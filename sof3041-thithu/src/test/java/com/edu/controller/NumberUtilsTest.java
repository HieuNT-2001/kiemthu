package com.edu.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    NumberUtils numberUtils;

    @BeforeAll
    public static void setUp() {
        System.out.println("Before all test methods");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After all test methods");
    }

    @BeforeEach
    public void init() {
        System.out.println("Before each test method");
    }

    @AfterEach
    public void destroy() {
        System.out.println("After each test method");
    }

    // Kiểm thử với số chẵn
    @Test
    void testEvenNumber() {
        assertTrue(NumberUtils.isEven(2));
    }

    // Kiểm thử với số lẻ
    @Test
    void testOddNumber() {
        assertFalse(NumberUtils.isEven(3));
    }

    // Kiểm thử với số 0
    @Test
    void testZeroNumber() {
        assertTrue(NumberUtils.isEven(0));
    }

    // Kiểm thử với số âm chẵn
    @Test
    void testNegativeEvenNumber() {
        assertTrue(NumberUtils.isEven(-2));
    }

    // Kiểm thử với số âm lẻ
    @Test
    void testNegativeOddNumber() {
        assertFalse(NumberUtils.isEven(-1));
    }
}
