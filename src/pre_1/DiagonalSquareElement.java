package pre_1;

public class DiagonalSquareElement {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int n=0;
		int[] result=new int[a.length];
		
		for (int i = 2; i >=0; i--) {
			for (int j = 2; j >=0; j--) {
				if (i==j) {
					result[n]=a[i][j]*a[i][j];
					n++;
				}
			}
		}
		for(Integer x:result) {
			System.out.println(x);
		}
	}
}
