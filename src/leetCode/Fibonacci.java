package leetCode;

public class Fibonacci {
	 public static int Fibonacci(int n) {
	        if(n==0) return 0;
	        else if(n==1) return 1;
	        else if(n<0) return 0;
	        else return Fibonacci(n-1)+Fibonacci(n-2);
	    }
	 public static int Fibonacci2(int n) {
		 	if(n==0) return 0;
	        else if(n==1) return 1;
	        else if(n<0) return 0;
	        int[] array = new int[n+1];
	        array[0] = 0;
	        array[1] = 1;
	        for(int i=2;i<n+1;i++){
	        	array[i] = array[i-1] + array[i-2];
	        }
	        
	        return array[n];
	        
	    }
	 public static void main(String[] args) {
		System.out.println(Fibonacci(40));
		System.out.println(Fibonacci2(40));
	}
}
