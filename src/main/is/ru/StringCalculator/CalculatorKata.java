package is.ru.StringCalculator; 

public class CalculatorKata
{
	private static int toInt(String number)
		{
			return Integer.parseInt(number);
		}

	private static String[] splitNumbers(String numbers)
	{
    	return numbers.split(",");
	}	

	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;
		}

		else if(text.contains(","))
		{
   			String[] numbers = text.split(",");
    		int total = 0;
    		for(String number : numbers)
    		{
        	total += toInt(number);
    		}
   		 return total;
		}
		else
		return 1;

	}
}