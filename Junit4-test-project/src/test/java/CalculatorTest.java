
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.easylearning.Calculator;

public class CalculatorTest {

	public static Calculator calculator = null;

	@BeforeClass
	public static void beforeALL() {
		calculator = new Calculator();
	}

	@AfterClass
	public static void afterALL() {
		calculator = null;
	}

	@Test
	public void testAddMethod() {

		int actualValue = calculator.addMethod(10, 5);
		int expectedValue = 15;

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testmultiplyMethod() {

		int actualValue = calculator.multiplyMethod(10, 5);
		int expectedValue = 50;

		assertEquals(expectedValue, actualValue);
	}

}
