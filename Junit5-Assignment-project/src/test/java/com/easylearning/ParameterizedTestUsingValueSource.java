package com.easylearning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestUsingValueSource {
	

	@ParameterizedTest
	@ValueSource(strings = {"10","30","50","70"})
	public void test_parameterizedTest_ConverStringValueToInt(String str) {
		Assignment1 assignment1 = new Assignment1();
		
		int actualValue = assignment1.converStringValueToInt(str);
		int expectedValue = Integer.parseInt(str);
		
		assertEquals(expectedValue, actualValue);
	}

}
