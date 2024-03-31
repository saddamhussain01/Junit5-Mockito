package com.easylearning;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestUsingValueSource {
	
	@ParameterizedTest
	@ValueSource(ints = { 20, 40, 10 })
	public void test_checkEvenOrOdd2(int num) {

		EvenOrOdd evenOrOdd = new EvenOrOdd();

		boolean actualValue = evenOrOdd.checkEvenOrOdd(num);
		assertTrue(actualValue);

	}
	
	@ParameterizedTest
	@ValueSource(ints = { 3, 11, 13 })
	public void test_checkEvenOrOdd3(int num) {

		EvenOrOdd evenOrOdd = new EvenOrOdd();

		boolean actualValue = evenOrOdd.checkEvenOrOdd(num);
		assertFalse(actualValue);

	}

}
