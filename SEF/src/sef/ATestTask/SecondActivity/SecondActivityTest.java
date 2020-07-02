package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	public void testGetSumPositiveValue() {
		assertEquals(15, (theCalculator.add(5, 10)));
		assertEquals(15, (theCalculator.add(10, 5)));
	}

	//Example ->
	public void testDivide() {
		assertEquals(2, (theCalculator.add(10, 5)));
		assertEquals(0, (theCalculator.add(0, 0)));
	}
	
	public void testSubtract() {
		assertEquals(-15, (theCalculator.subtract(-5, 10)));
		assertEquals(15, (theCalculator.subtract(5, -10)));
	}
	
	public void testMultiply() {
		assertEquals(10, (theCalculator.multiply(1, 10)));
	}
	

}

