package leetCode;

public class StrToInt {
	
	public int find(String str) {
        if(str==null||str.length()==0)
        	return 0;
        char[] c = str.toCharArray();
        boolean neg = false;
        int i = 0;
        if(c[0]==45) {
        	neg = true;
        	i = 1;
        }
        else if(c[0]==43){
        	i = 1;
        }
        int num = 0;
        while(i<str.length()){
        	if(c[i]<48||c[i]>57){
        		return 0;
        	}
        	num = num*10 + (c[i]-48);
        	i++;
        }
        return neg?-num:num;
    }
	public static void main(String[] args) {
		StrToInt s = new StrToInt();
		System.out.println(s.find("123-1242"));
	}
}
