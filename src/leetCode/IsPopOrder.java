package leetCode;

import java.util.ArrayList;

public class IsPopOrder {
	public static boolean isPopOrder(int [] pushA,int [] popA) {
		if(pushA.length!=popA.length) return false;
        if(pushA.length==0) return true;
        if(pushA.length==1) return pushA[0]==popA[0];
     	int len = pushA.length;
      	ArrayList<Integer> a = new ArrayList<Integer>();
        int i,j,aSize=0;
        i = 0;
        j = 0;
        a.add(pushA[i++]);
        aSize++;
        while(j<len){
            int positon = a.indexOf(popA[j]);
            if(positon==-1){
                a.add(pushA[i++]);
                    aSize++;
            }
            else if(positon<aSize-1)
                return false;
            else if(positon==aSize-1){
                a.remove(positon);
                aSize--;
                j++;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		int[] a = {1};
		int[] b = {4,5,3,2,1};
		int[] c = {1};
		System.out.println(isPopOrder(a, c));
	}
}
