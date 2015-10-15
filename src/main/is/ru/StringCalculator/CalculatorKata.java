package is.ru.StringCalculator; 

public class CalculatorKata
{
	public static int add(String text){

		if (text.isEmpty()){
			return 0;
		}
		else if(text.contains(",")){
			String[] tokens = text.split(",");
			return toInt(tokens[0]) + toInt(tokens[1]);
		}

		else{
			return toInt(text);
		}

	}

	private static int toInt(String text){
		return Integer.parseInt(text);
	}
	
}