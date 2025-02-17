package com.edu.test.utils;

import org.testng.annotations.Test;

public class GroupDemoTest {

    @Test(groups = "Regression3")
    public void testCase1() {
        System.out.println("GroupDemoTest: Test Case 1");
    }

    @Test(groups = "Regression3")
    public void testCase2() {
        System.out.println("GroupDemoTest: Test Case 2");
    }
}
