package leetCode;

public class LeftRotateString {
	public String find(String str,int n) {
        int len;
        if(n<=0||str==null||(len=str.length())==0||n==len)
            return str;
//        while(n>len){
//            n = n - len;
//        }
        n = n % len;
        StringBuilder sb = new StringBuilder(str.substring(n));
        sb.append(str.substring(0,n));
        
        return sb.toString();
    	}
	
	public static void main(String[] args) {
		LeftRotateString lrs = new LeftRotateString();
		System.out.println(lrs.find("", 2));
	}
}
