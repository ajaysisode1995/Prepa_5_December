package pre_1;

public class Nov_10 {
	public static void main(String[] args) {
		  int[] a = {3,1,5,2,7};
	        int[] result = new int[a.length];
	        int n;
	        boolean ischange = true;
	        int o=0,p=0,d=0;
	        if(a.length %2 == 0)
	            n=a.length/2;
	        else 
	            n=a.length/2 + 1;
	        int[] b = new int[n];
	        int[] c = new int[a.length - n];
	        for(int i= 0;i<a.length;i++) {
	            if(ischange) {
	                b[o] = a[i];
	                o++;
	                ischange= false;
	            }
	            else {
	                c[p] = a[i];
	                p++;
	                ischange = true;
	            }
	        }
	        ischange = true;
	        for(int i= 0;i<a.length;i++) {
	            if(ischange) {
	                result[i] = b[o-1];
	                o--;
	                ischange= false;
	            }
	            else {
	                result[i] = c[a.length-n-p];
	                p--;
	                ischange = true;
	            }
	        }
	        for(int i=0;i<result.length;i++) {
	            System.out.print(result[i]+" ");
	        }
	    }
	}
