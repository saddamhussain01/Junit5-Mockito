package com.easylearning;

public class Calculator {

	private int addPrivate(int a, int b) {
		return a + b;
	}

	// Public method that uses `addPrivate`
	public int add(int a, int b) {
		return addPrivate(a, b);
	}
}
