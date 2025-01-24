package poly.edu;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {

	Caculator caculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		caculator = new Caculator();
	}

	@After
	public void tearDown() throws Exception {
		caculator = null;
	}

	@Test
	public void testAdd() {
		int result = caculator.add(10, 5);
		int expected = 15;
		assertEquals(expected, result);
	}

	@Test
	public void testSub() {
		int result = caculator.sub(10, 5);
		int expected = 5;
		assertEquals(expected, result);
	}

	@Test
	public void testMul() {
		int result = caculator.mul(10, 5);
		int expected = 50;
		assertEquals(expected, result);
	}

	@Test
	public void testDiv() {
		int result = caculator.div(10, 5);
		int expected = 2;
		assertEquals(expected, result);
	}

}
