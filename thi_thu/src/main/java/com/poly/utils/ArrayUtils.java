package com.poly.utils;

public class ArrayUtils {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

}
