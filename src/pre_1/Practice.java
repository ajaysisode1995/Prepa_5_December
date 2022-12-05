package pre_1;

public class Practice {
	public static void main(String[] args) {
		//an array
		int[] arr= {3,1,5,2,7};
		//7,1,5,2,3
		if (arr[0]<1) {
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]%2==0) {
					System.out.println(""+arr[i]);
				}
				else {
					for (int j = arr.length; j > i; j++) {
						
					}
				}
			}
		}
		
				
	}
}
