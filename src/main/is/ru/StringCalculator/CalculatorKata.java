package is.ru.StringCalculator; 

import java.util.Arrays;
import java.util.stream.Stream;

public class CalculatorKata
{
	public static int add(String text){

		if (text.isEmpty()){
			return 0;
		}
		else{
			Stream<String> tokens = Arrays.stream(text.split(",|\n"));
			return tokens.mapToInt(Integer::parseInt).sum();
		}
			}

	
	
}