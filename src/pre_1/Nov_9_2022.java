package pre_1;


import java.util.stream.Stream;

public class Nov_9_2022 {
	public static void main(String[] args) {
		
        int ar[] = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                System.out.print(" " + ar[i]);
            } 
            else {
                for (int j = ar.length - i; j >= 0; j--) {
                    if (ar[j] % 2 != 0) {
                        System.out.print(" " + ar[j]);
                        break;
                    }

                }
            }
        }

//		Stream<Integer> mylist = Stream.of(1,2,3,4,5,6,7,8);
//		mylist.forEachOrdered(null);
	}
}

