package pre_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTest {
	//Input Array (1,2,3) Output Array (6,3,2)
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3);
		List<Integer> collect = asList.stream().sorted().filter(x->{
			if (x==3) {
				System.out.println("2");
				
			}
			else if (x==2) {
				System.out.println("3");
				
			}
			else {
				System.out.println(x*6);
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		
		
	}
}
