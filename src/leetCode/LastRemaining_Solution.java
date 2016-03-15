package leetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LastRemaining_Solution {
	public int find(int n, int m) {
		if(n<1||m<1)
			return -1;
		int[] array = new int[n];
		int i=-1,step=0,count=n;
		while(count>0){
			i++;
			if(i>=n) i=0;
			if(array[i]==-1) continue;
			step++;
			if(step==m){
				array[i] = -1;
				step=0;
				count--;
			}
		}
		return i;
    }
	
	public static void main(String[] args) {
		LastRemaining_Solution ls = new LastRemaining_Solution();
		System.out.println(ls.find(2, 1));
	}
}
