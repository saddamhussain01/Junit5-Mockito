package com.easylearning;

public class Assignment1 {

	public int converStringValueToInt(String str) {

		if (str == null || str.trim().length() == 0) {

			throw new IllegalArgumentException("String must not be null or empty");
		}
		return Integer.valueOf(str);
	}

	
	public static void main(String[] args) {

		Assignment1 assignment1 = new Assignment1();
		
		int num =  assignment1.converStringValueToInt("10");
		
		System.out.println(num);
	}

}
