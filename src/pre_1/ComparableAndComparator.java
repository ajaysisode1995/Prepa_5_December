package pre_1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableAndComparator {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("z");
		l.add("y");
		l.add("x");
		System.out.println("before comparing "+l);
		Collections.sort(l);
	System.out.println("aftet comparing "+l);
	
	System.out.println("*****by using comparator");
	
	Collections.sort(l, new MyComparator());
	
	System.out.println("Using Comparator::"+l);

	
		
		
		
	}

}
