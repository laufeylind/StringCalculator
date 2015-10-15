package is.ru.StringCalculator; 

import java.util.Arrays;
import java.util.stream.Stream;

public class CalculatorKata{

	public static int add(String text){
		if (text.isEmpty()){
			return 0;
		}

		String delimiter = ",|\n";
		if (text.startsWith("//")){
			String parts[] = text.split("\n", 2);
			delimiter = parts[0].substring(2);
			text = parts[1];
		}

			Stream<String> numbers = Arrays.stream(text.split(delimiter));
			return numbers.mapToInt(Integer::parseInt).sum();

	}

	
	
}