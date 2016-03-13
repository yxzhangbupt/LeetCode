package leetCode;

public class GetNumberOfK {
	public static int find(int [] array , int k) {
			if(array==null||array.length==0)
				return 0;
	       int lo = 0;
	       int hi = array.length-1;
	       int mid=0;
	        int count=0;
	       while(lo<=hi){
	           mid = lo + (hi - lo)/2;
	           if(k<array[mid])
	    			hi = mid - 1;
	           else if(k>array[mid])
	               lo = mid + 1;
	           else {
	               count++;
	               break;
	           } 
	       }
	        
	       int j = mid-1;
	        mid++;
	        while(mid<array.length){
	            if(array[mid++]!=k)
	                break;
	            else count++;
	        }
	        while(j>=0){
	            if(array[j--]!=k)
	                break;
	            else count++;
	        }
	        
	        return count;
	    }
	
	public static void main(String[] args) {
		int[] a = {1,1,2,3,4,5,67};
		System.out.println(find(null, 0));
	}
}
