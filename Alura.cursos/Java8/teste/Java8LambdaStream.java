package teste;

import java.util.Arrays;
import java.util.List;

public class Java8LambdaStream {
	public static void main(String[] args) {
		
		
		List<Integer> asList = Arrays.asList(1,4,6,8);
		asList.stream()
		.filter(e -> e % 2 == 0)
		.forEach(e -> System.out.println(e));
		
	}
}
