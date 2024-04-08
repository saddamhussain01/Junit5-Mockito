package com.easylearning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	@Test
	public void test_add() {
		
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(2, 3));
		
	}
	
	
    @Test
    void test_AddPrivate() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
        Calculator calculator = new Calculator();
        
      //This line retrieves a reference to the private method named addPrivate from the Calculator class, which takes two int parameters.
        Method addPrivateMethod = Calculator.class.getDeclaredMethod("addPrivate", int.class, int.class);
        
        addPrivateMethod.setAccessible(true); // This makes the private method accessible
        assertEquals(5, addPrivateMethod.invoke(calculator, 2, 3));
    }
 
}
