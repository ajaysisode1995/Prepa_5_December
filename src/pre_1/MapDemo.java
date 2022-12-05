package pre_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Program-take a list of 10 integers,
//multiply each element by 2 using java8 feature.
public class MapDemo {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
		
		asList.stream().map(x -> x * 2).collect(Collectors.toList());
		
		
	}
}
