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

	@Test
	public void shouldReturnSameNumberWhenInputIsOneNumber(){
		assertEquals(1, CalculatorKata.add("1"));
	}

	@Test
	public void shouldReturnSumOfTwoNumbers(){
		assertEquals(3, CalculatorKata.add("1,2"));
	}

	@Test
	public void shouldReturnSumOfMultipleNumbers(){
		assertEquals(6, CalculatorKata.add("1,2,3"));
	}	
		
	


}

