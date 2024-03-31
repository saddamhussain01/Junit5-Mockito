package com.easylearning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



public class TestAssignment1 {

	// passing string integer value
	@Test
	public void test_converStringValueToInt() {
		Assignment1 assignment1 = new Assignment1();
		int actualValue = assignment1.converStringValueToInt("20");
		int expectedValue = 20;

		assertEquals(expectedValue, actualValue);
	}
	

	@Test
	public void test_convertStringValueToIntpassingStrnullValue() {
		Assignment1 assignment1 = new Assignment1();
		String str = null;
		assertThrows(IllegalArgumentException.class, () -> assignment1.converStringValueToInt(str));

	}

	@Test
	public void test_converStringValueToIntPassingEmptyStr() {
		Assignment1 assignment1 = new Assignment1();

		String str = "";
		assertThrows(IllegalArgumentException.class, () -> assignment1.converStringValueToInt(str));
	}
	
	
	  
	 
	 

}
