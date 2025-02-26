package com.edu.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    ArrayUtils arrayUtils;

    // Kiểm thử với mảng rỗng
    @Test
    void testEmptyArray() {
        int array[] = {};
        int expected = 0;
        int result = ArrayUtils.sumArray(array);
        assertEquals(expected, result);
    }

    // Kiểm thử với mảng có một phần tử
    @Test
    void testOneElementArray() {
        int array[] = { 5 };
        int expected = 5;
        int result = ArrayUtils.sumArray(array);
        assertEquals(expected, result);
    }

    // Kiểm thử với mảng có 5 phần tử
    @Test
    void testFiveElementArray() {
        int array[] = { 1, 2, 3, 4, 5 };
        int expected = 15;
        int result = ArrayUtils.sumArray(array);
        assertEquals(expected, result);
    }

    // Kiểm thử với mảng số âm
    @Test
    void testNegativeNumberArray() {
        int array[] = { -1, -2, -3 };
        int expected = -6;
        int result = ArrayUtils.sumArray(array);
        assertEquals(expected, result);
    }

    // Kiểm thử với mảng chứa cả số âm và số dương
    @Test
    void testMixedNumberArray() {
        int array[] = { -1, 2, -3, 4 };
        int expected = 2;
        int result = ArrayUtils.sumArray(array);
        assertEquals(expected, result);
    }

}
