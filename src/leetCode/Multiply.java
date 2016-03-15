package leetCode;

import java.util.Stack;

public class Multiply {
	public int[] multiply(int[] A) {
		int[] B = new int[A.length];
        if(A==null||A.length==0)
            return B;
        int sum;
        for(int i=0;i<A.length;i++){
            sum = 1;
            for(int j=0;j<A.length;j++){
                if(j==i)
                    continue;
                sum *= A[j];
            }
            B[i] = sum;
        }
        return B;
    }
	
	public static void main(String[] args) {
		Multiply m =new Multiply();
		int[] A ={1,2,3,4,5};
		int[] B = m.multiply(A);
		for(int i:B){
			System.out.print(i+" ");
		}
		
	}
}
