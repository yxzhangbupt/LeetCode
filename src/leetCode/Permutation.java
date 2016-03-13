package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Permutation {
	public static ArrayList<String> Permutation(String str) {
       	ArrayList<String> result = new ArrayList<String>();
       	HashSet<String> a = new HashSet<String>();
       	if(str==null||str.length()==0)
       		return result;
       	int len = str.length();
        char[] c = new char[len];
        for(int i=0;i<len;i++){
            c[i] = str.charAt(i);
        }
//        a.add(new String(c));
        Permutation(a,c,0);
        result.addAll(a);
        Collections.sort(result);
        return result;
    }
    
	private static void Permutation(HashSet<String> a,char[] c,int begin){
		
        if(begin==c.length){
        	a.add(new String(c));
        	return;
        }
        
        for(int i=begin;i<c.length;i++){
        	each(c, begin, i);
        	Permutation(a, c, begin+1);
        	each(c, begin, i);
        }
        	
        
        
    }
    
    private static void each(char[] c,int i,int j){
    	if(i!=j){
    		char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
    	}
        
    }
    
    public static void main(String[] args) {
    	String s = "abc";
    	ArrayList<String> a = Permutation(s);
		System.out.println(a);
	}
}
