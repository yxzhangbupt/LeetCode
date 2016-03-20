package leetCode;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public  class MoreThanHalfNum {
//	public static int find(int [] array) {
//		if(array==null) return 0;
//        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
//        int len = array.length;
//        if(len==0) return 0;
//        for(int i=0;i<len;i++){
//        	if(!a.containsKey(array[i])) 
//        		a.put(array[i],1);
//        	else  a.put(array[i],a.get(array[i])+1);
//        }
//        
//        int maxnum = array[0];
//        int max = 0;
//        for(Entry<Integer, Integer> e : a.entrySet()){
//        	if(e.getValue()>max){
//        		max = e.getValue();
//        		maxnum = e.getKey();
//        	}
//        }
//        
//        return max>len/2?maxnum:0;
//    }
	public static int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length==0)
            return 0;
        if(array.length==1){
        	return array[0];
        }
        int lo = 0;
        int hi = array.length-1;
        int mid = array.length>>1;
        int part = partition(array,lo,hi);
        
        while(mid!=part){
            if(part<mid)
                lo = part+1;
            else 
                hi = part-1;
             part = partition(array,lo,hi);
        }

        int result = array[mid];
        if(!isMoreThanHalf(array,result)){
            return 0;
        }
        
        return result;
    }
    
    private static int partition(int[] array,int start,int end){
        int i = start;
        int j = end+1;
        int u = array[start];
        while(true){
            while(array[++i]<u){
                if(i>=end)
                    break;
            }
            
            while(array[--j]>u);
            
            if(i>j)
                break;
            each(array,i,j);
        }
        each(array,j,start);
        return j;
    }
    
    private static boolean isMoreThanHalf(int[] array,int num){
        int times = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==num)
                times++;
        }
        
        return 2*times>=array.length;
    }
    
    private static void each(int[] array,int index1,int index2){
        if(index1<0||index2<0||index1>=array.length||index2>=array.length)
            return;
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
	public static void main(String[] args) {
//		int[] a = {1,2,3,2,2,2,5,4,2};
		int[] a ={1};
		System.out.println(MoreThanHalfNum_Solution(a));
	}
	
}
