package is.ru.StringCalculator; 

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorKataTest
{
	public static void main(String args[]) 
	{
    	org.junit.runner.JUnitCore.main("is.ru.StringCalculator.CalculatorKataTest");
    }
	
	@Test
	public void shouldReturnZeroOnEmptyString (){
		assertEquals(0, CalculatorKata.add(""));
	}	


	/*@Test
	public void testEmptyString() 
	{
		assertEquals(0, CalculatorKata.add(""));
	}

	@Test
	public void testOneNumber() 
	{
		assertEquals(1, CalculatorKata.add("1"));
	}

	@Test
	public void testTwoNumber() 
	{
		assertEquals(3, CalculatorKata.add("1,2"));
	}

	@Test
	public void testMultibleNumbers() 
	{
		assertEquals(6, CalculatorKata.add("1,2,3"));
	}

	@Test
	public void testNewLinesBetweenNumbers() 
	{
		assertEquals(10, CalculatorKata.add("5\n2,3"));
	}

	/*@Test
	public void testIfProgramSupportsDifferentDilemeters() 
	{
		assertEquals(10, CalculatorKata.add("//;\n2;8"));
	}*/




}

