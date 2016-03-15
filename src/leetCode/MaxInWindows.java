package leetCode;

import java.util.ArrayList;

public class MaxInWindows {
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {	ArrayList<Integer> list = new ArrayList<Integer>();
    	if(size==0||num==null||num.length==0)
    		return list;
        int i = 0;
        int j = 0;
        int maxSize = num.length-size+1;
        int balance = num.length-size;
        if(balance<0) return list;
        int[] max = new int[balance>0?maxSize:1];
        max[0] = num[0];
        int lastMax = 0;
        do{if(num[j]>max[0]){
            max[0] = num[j];
            lastMax = j;
        }
        j++;}
        while(j<size&&j<num.length);
        if(balance==0){
        	list.add(max[0]);
        	return list;
        }
        j--;
        do{
           j++;
           i++;
           if(num[j]>max[i-1]){
               max[i] = num[j];
               lastMax = j;
           }
           else if(lastMax>=i){
               max[i] = max[i-1];
           }
           else{
               for(int k=i;k<=j;k++){
                   if(num[k]>max[i]){
                       max[i] = num[k];
                       lastMax = k;
                   }
               }
           }
        }while(j<num.length-1);
        for(int m=0;m<max.length;m++){
        	list.add(max[m]);
        }
        return list;
        
    }
	public static void main(String[] args) {
		MaxInWindows m = new MaxInWindows();
		int[] a = {16,14,12,10,8,6,4};
		System.out.println(m.maxInWindows(a, 5));
	}
}
