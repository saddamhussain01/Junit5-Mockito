package com.easylearning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedTestUsingMethodSource {
	
	@ParameterizedTest
	@MethodSource("passingIntValuesinMethod")
	public void test_checkEvenOrOdd(int num, boolean expectedValue) {
		
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		boolean actualValue = evenOrOdd.checkEvenOrOdd(num);
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	
	static Stream<Arguments> passingIntValuesinMethod(){
		
		return Stream.of(
				
				Arguments.of(10,true),
				Arguments.of(11,false),
				Arguments.of(20,true),
				Arguments.of(13,false)
				
				);
	}
	
	@Test
	@RepeatedTest(value = 3)
	public void test_checkEvenOrOdd1() {
		
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		boolean actualValue = evenOrOdd.checkEvenOrOdd(10);
		
		assertTrue(actualValue);
		
	}

}
