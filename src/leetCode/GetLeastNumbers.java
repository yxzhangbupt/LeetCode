package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class GetLeastNumbers {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        if(k==0||input==null||input.length==0||k>input.length)
        	return a;
        for(int i=0;i<input.length;i++){
        	a.add(input[i]);
        }
        Collections.sort(a);
        while(a.size()>k)
        	a.remove(k);
        return a;
    }
	
	public static void main(String[] args) {
		int[] a = {4,5,1,6,2,7,3,8};
//		int[] a = null;
		System.out.println(GetLeastNumbers_Solution(a, 9));
	}
}
