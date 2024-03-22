import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.easylearning.Assignment1;

public class TestAssignment1 {
	
	@Test
	public void testConvertToInt() {
		
		Assignment1 assignment1 = new Assignment1();
		int actualValue = assignment1.converToInt("10");
		int expectedValue = 10;
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void testConvertToIntPassingStrNull() {
		
		Assignment1 assignment1 = new Assignment1();
		String str = null;
		
		assertThrows(IllegalArgumentException.class, () -> assignment1.converToInt(str));
		
	}
	
	/*
	 * @ParameterizedTest
	 * 
	 * @ValueSource(strings = {"10", "20", "3", "14","5"}) public void
	 * testParameterizedConvertToInt(String str) {
	 * 
	 * Assignment1 assignment1 = new Assignment1(); int actualValue =
	 * assignment1.converToInt(str); int expectedValue [] = {10,20,3,14,5 };
	 * 
	 * assertEquals(expectedValue, actualValue);
	 * 
	 * }
	 */
	

}
