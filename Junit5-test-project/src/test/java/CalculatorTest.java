import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	public static  Calculator calculator = null;
	
	
	@BeforeAll
	public static void beforeALL() {
		calculator = new Calculator();
	}
	
	@AfterAll
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
