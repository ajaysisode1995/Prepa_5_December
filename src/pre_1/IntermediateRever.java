package pre_1;

public class IntermediateRever {
     public static void main(String[] args) {
    	 int [] arr= {3,1,5,2,7};
         int n=0;
         int t=0;
         for (int i = 0; i < arr.length; i++) {
             if(i%2!=0) {
                 t++;
             }
         }
         int b[] =new int[t];
         for (int i = 0; i < arr.length;i++) {
             if (i%2!=0) {
                 b[n++]=arr[i];
             }
         
         }
         for (int i = 0; i < arr.length; i++) {
             if(i%2!=0) {
                 System.out.print(" "+b[--t]);
             }
             else {
                 System.out.print(" "+arr[i]);
             }
         }  
	}
}
