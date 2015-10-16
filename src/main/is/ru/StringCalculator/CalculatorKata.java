package is.ru.StringCalculator; 

import java.util.Arrays;
import java.util.stream.Stream;

public class CalculatorKata{

	private String delimiter;
	private String numbers;

	private CalculatorKata(String delimiter, String numbers){
		this.delimiter = delimiter;
		this.numbers = numbers;
	}


	public static int add(String text){
		if (text.isEmpty()){
			return 0;
		}

		CalculatorKata calculator;
		String delimiter = ",|\n";
		if (text.startsWith("//")){
			String parts[] = text.split("\n", 2);
			delimiter = parts[0].substring(2);
			text = parts[1];
			calculator = new CalculatorKata(delimiter, text);
		}
		else{
			calculator = new CalculatorKata(",|\n", text);
		}

		Stream<String> numbers = Arrays.stream(text.split(delimiter));
		return numbers.mapToInt(Integer::parseInt).sum();

	}

	
	
}