package pre_1;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		
		return o1.toString().compareTo(o2.toString());
	}

}
