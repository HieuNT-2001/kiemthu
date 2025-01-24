package poly.edu;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseArrayTest {

    ReverseArray reverseArray;

    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() {
    }

    @Before
    public void init() {
        reverseArray = new ReverseArray();
    }

    @After
    public void destroy() {
        reverseArray = null;
    }

    @Test
    public void testReverseArray() {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] expected = { 5, 4, 3, 2, 1 };
        int[] actual = reverseArray.reverseArray(array);
        assertArrayEquals(expected, actual);
    }
}
