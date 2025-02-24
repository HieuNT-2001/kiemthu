package com.poly.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    // Kiem tra voi mang rong
    @Test
    void testSumArray1() {
        int arr[] = {};
        int expected = 0;
        int actual = ArrayUtils.sumArray(arr);
        assertEquals(expected, actual);
    }

    // Kiem tra voi mang 1 phan tu
    @Test
    void testSumArray2() {
        int arr[] = { 5 };
        int expected = 5;
        int actual = ArrayUtils.sumArray(arr);
        assertEquals(expected, actual);
    }

    // Kiem tra voi mang 5 phan tu
    @Test
    void testSumArray3() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int expected = 15;
        int actual = ArrayUtils.sumArray(arr);
        assertEquals(expected, actual);
    }

    // Kiem tra voi mang so am
    @Test
    void testSumArray4() {
        int arr[] = { -1, -2, -3, -4, -5 };
        int expected = -15;
        int actual = ArrayUtils.sumArray(arr);
        assertEquals(expected, actual);
    }

    // Kiem tra voi mang chua ca so am va duong
    @Test
    void testSumArray5() {
        int arr[] = { 1, 2, -3, 5, -4 };
        int expected = 1;
        int actual = ArrayUtils.sumArray(arr);
        assertEquals(expected, actual);
    }
}
