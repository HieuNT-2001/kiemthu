package poly.edu;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {

    Fibonacci fibonacci;

    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() {
    }

    @Before
    public void init() {
        fibonacci = new Fibonacci();
    }

    @After
    public void destroy() {
        fibonacci = null;
    }

    @Test
    public void testFibonacci() {
        int expected = 55;
        int actual = fibonacci.fibonacci(10);
        assertEquals(expected, actual);
    }
}
