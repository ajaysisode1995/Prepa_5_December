package pre_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyDemo {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		asList.stream().map(x->x*2).collect(Collectors.toList()).forEach(System.out::println);
	}
}
