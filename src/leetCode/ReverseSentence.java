package leetCode;

import java.util.Stack;

public class ReverseSentence {
	public String find(String str) {
        if(str==null||str.length()==0)
            return str;
        String[] s = str.split(" ");
        if(s.length==0)
        	return str;
        int len = s.length;
        Stack<String> stc = new Stack<String>();
        for(int i=0;i<len;i++){
            stc.push(s[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++){
        	if(i < len-1){
        		sb.append(stc.pop()+" ");
        	}
        	else sb.append(stc.pop());
        }
        
        return sb.toString();
    }
	
	public static void main(String[] args) {
		ReverseSentence re = new ReverseSentence();
		System.out.println("["+re.find("    ")+"]");
	}
}
