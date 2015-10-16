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

	private int sum(){
		return Arrays.stream(numbers.split(delimiter)) //create the stream
		.mapToInt(Integer::parseInt) // map the stream to integer
		.sum(); // sum of total. 
	}

	public static int add(String text){
		if (text.isEmpty()){
			return 0;
		}
		
		return parseText(text).sum();
	}

	private static CalculatorKata parseText(String text){		
		if (text.startsWith("//")){
			String parts[] = text.split("\n", 2);
			return new CalculatorKata(parts[0].substring(2), parts[1]);
		}
		else {
			return new CalculatorKata(",|\n", text);
		}
	}
	
}