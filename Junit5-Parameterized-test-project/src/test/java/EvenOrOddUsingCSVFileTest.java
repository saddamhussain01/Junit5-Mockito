
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class EvenOrOddUsingCSVFileTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/inputData.csv", numLinesToSkip = 1)
	public void testParameterizedCheckEvenOrOdd(String input, String expected) {

		EvenOrOddUsingCSVFile evenOrOddUsingCSVFile = new EvenOrOddUsingCSVFile();

		String actualValue = evenOrOddUsingCSVFile.checkEvenOrOdd(Integer.parseInt(input));

		assertEquals(expected, actualValue);
	}
}
