package leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstNotRepeatingChar {
	public static int find(String str) {
		if(str==null||str.length()==0) return -1;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        ArrayList<Character> list = new ArrayList<Character>();
        int i = 0;
        while(i<str.length()){
            Character a = str.charAt(i);
            if(list.contains(a)){
                i++;
                continue;
            }
            else if(map.containsKey(a)){
                map.remove(a);
                list.add(a);
            }
            else map.put(a,i);
            i++;
        }
        if(map.isEmpty()) return -1;
        int min=str.length();
        for(Integer j:map.values()){
        	
            if(j<min)
                min = j;
        }
        
        return min;
    }
	
	public static void main(String[] args) {
		System.out.println(find("aabccdbd"));
	}
}
