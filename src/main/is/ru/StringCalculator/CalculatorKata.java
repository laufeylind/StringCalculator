package is.ru.StringCalculator; 

public class CalculatorKata
{
	public static int add(String text){

		if (text.isEmpty()){
			return 0;
		}
		else{
			return Integer.parseInt(text);
		}

	}

	
}