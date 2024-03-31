package com.easylearning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestEvenOrOdd {

	@Test
	public void test_checkEvenOrOdd() {
		EvenOrOdd evenOrOdd = new EvenOrOdd();

		boolean actualValue = evenOrOdd.checkEvenOrOdd(10);

		assertTrue(actualValue);
	}

	@Test
	public void test_checkEvenOrOdd1() {
		EvenOrOdd evenOrOdd = new EvenOrOdd();

		boolean actualValue = evenOrOdd.checkEvenOrOdd(11);

		assertFalse(actualValue);
	}

	

}
