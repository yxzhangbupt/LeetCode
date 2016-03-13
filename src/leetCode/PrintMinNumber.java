package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintMinNumber {
	
	public  static class CompareA implements Comparator<String>{
		public int compare(String a,String b){
			if(a==b) return 0;
			int alen = a.length();
			int blen = b.length();
			int i = 0;
			while(i<Math.min(alen, blen)){
				if(a.charAt(i)>b.charAt(i))
					return 1;
				else if(a.charAt(i)<b.charAt(i))
					return -1;
				else i++;
			}
			if(alen>blen){
				if(a.charAt(i)<=a.charAt(0))
					return -1;
				else return 1;
			}
			else {
				if(b.charAt(i)<b.charAt(0))
					return 1;
				else return -1;
			}
		}
	}
	
	public static String PrintMinNumber(int [] numbers) {
		ArrayList<String> s = new ArrayList<String>();
		Comparator<String> com = new CompareA();
		for(int i=0;i<numbers.length;i++){
			s.add(Integer.toString(numbers[i]));
		}
		Collections.sort(s,com);
		StringBuilder sb = new StringBuilder();
		for(String str:s){
			sb.append(str);
		}
		return sb.toString();
    }
	public static void main(String[] args) {
		int[] a = {3,32,321};
		System.out.println(PrintMinNumber(a));
	}
}
