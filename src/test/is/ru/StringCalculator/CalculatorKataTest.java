package is.ru.StringCalculator; 

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorKataTest
{
	CalculatorKata calculator = new CalculatorKata();
	@Test
	public void testEmptyString()
	{
		assertEquals (0, calculator.add(""));
	}

	@Test
	public void testOneNumber()
	{
		assertEquals (1, calculator.add("1"));
	}
}

