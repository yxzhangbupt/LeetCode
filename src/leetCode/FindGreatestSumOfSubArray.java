package leetCode;

public class FindGreatestSumOfSubArray {
	 public static int find(int[] array) {
	        int max = 0;
	        if(array==null||array.length==0)
	        	return 0;
	        boolean hasPositive = false;
	        int min = array[0];
	        for(int s : array){
	        	if(s>0) hasPositive = true;
	        	else if(s>min) min = s;
	        }
	        if(!hasPositive){
	        	return min;
	        }
	        int len = array.length; 
	        int sum=0;
	        int i=0,j=0;
	        for(;i<len;i++){
	        	sum += array[i];
	        	if(array[i]>0&&sum>max){
	        		max = sum;
	        	}
	        	if(array[i]<0&&sum<0){
	        		sum=0;
	        	}
	        }
	        
	        return max;
	    }
	 public static void main(String[] args) {
		int[] a = {-6,-3,-2,-7,-15,-1,-2,-2};
//		 int[] a={};
		System.out.println(find(a));
	}
}
