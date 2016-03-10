package leetCode;

public class Solution {
	public static String replaceSpace(StringBuffer str) {
//		System.out.println(str.length());
    	String s = str.toString();
        if(!s.contains(" ")) return s;
        
        String[] sa = s.split(" ");
        if(sa.length==0){
        	s = "";
        	for(int i = 0;i<str.length();i++){
        		s += "%20";
        	}
        	return s;
        }
        int i = 1;
        while(i<sa.length){
            sa[0] = sa[0] + "%20" + sa[i];
            i++;
        }
//        if(s.charAt(0)==' ') sa[0] = "%20" + sa[0];
        if(s.endsWith(" ")) sa[0] += "%20" ;
        return sa[0];
    }
	public static void main(String args[]){
		StringBuffer str = new StringBuffer("  b ");
		System.out.println(replaceSpace(str));
	}
}
