package leetCode;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public  class MoreThanHalfNum {
	public static int find(int [] array) {
		if(array==null) return 0;
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        int len = array.length;
        if(len==0) return 0;
        for(int i=0;i<len;i++){
        	if(!a.containsKey(array[i])) 
        		a.put(array[i],1);
        	else  a.put(array[i],a.get(array[i])+1);
        }
        
        int maxnum = array[0];
        int max = 0;
        for(Entry<Integer, Integer> e : a.entrySet()){
        	if(e.getValue()>max){
        		max = e.getValue();
        		maxnum = e.getKey();
        	}
        }
        
        return max>len/2?maxnum:0;
    }
	public static void main(String[] args) {
		int[] a = {1,2,3,2,2,2,5,4};
		System.out.println(find(a));
	}
	
}
