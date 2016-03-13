package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class GetUglyNumber {
	public static int GetUglyNumber_Solution(int index) {
		if(index<=0) return 0;
        ArrayList<Integer> s = new ArrayList<Integer>();
        s.add(1);
        int i = 1;
        int min;
        int p2=0,p3=0,p5=0;
        while(i<index){
        	min = Math.min(Math.min(s.get(p2)*2, s.get(p3)*3),s.get(p5)*5);
        	s.add(min);
        	while(s.get(p2)*2<=min)
        		p2++;
        	while(s.get(p3)*3<=min)
        		p3++;
        	while(s.get(p5)*5<=min)
        		p5++;
        	i++;
        }
        
//        Collections.sort(s);
        return s.get(i-1);
    }
	
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(7));
	}
}
