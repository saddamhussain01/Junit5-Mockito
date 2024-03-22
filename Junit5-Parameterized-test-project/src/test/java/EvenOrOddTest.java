
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenOrOddTest {

	/*
	 * @Test public void testCheckEvenOrOdd() {
	 * 
	 * EvenOrOdd evenOrOdd = new EvenOrOdd();
	 * 
	 * boolean actualValue = evenOrOdd.checkEvenOrOdd(10);
	 * 
	 * assertTrue(actualValue); }
	 * 
	 */

	@ParameterizedTest
	@ValueSource(ints = { 2, 10, 20 })
	public void testParameterizedCheckEvenOrOdd(int numb) {

		EvenOrOdd evenOrOdd = new EvenOrOdd();

		boolean actualValue = evenOrOdd.checkEvenOrOdd(numb);

		assertTrue(actualValue);
	}
}
