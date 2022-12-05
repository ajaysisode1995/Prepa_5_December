package pre_1;

public class Array_5_Dec {
	public static void main(String[] args) {
		

	        int arr[] = { 1, 2, 3 };

	        int[] result = new int[arr.length];

	        int j = 0;

	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i] + " ");
	        }
	        while (j < arr.length) {
	            int product = 1;
	            for (int i = 0; i < arr.length; i++)

	            {
	                if (i == j)

	                {
	                    continue;
	                }

	                else {
	                    product *= arr[i];
	                }

	            }
	            result[j] = product;
	            j++;
	        }
	        System.out.println();
	        for (int i = 0; i < result.length; i++) {
	            System.out.println(result[i] + " ");
	        }
	    }
	}

