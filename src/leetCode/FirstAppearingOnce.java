package leetCode;

public class FirstAppearingOnce {
	StringBuilder sb = new StringBuilder();
	public char find()
    {
		if(sb==null||sb.length()==0)
			return '#';
    	String s = sb.toString();
        int i =0;
        while(i<s.length()){
        	char c = s.charAt(i);
            if(i!=s.indexOf(c)){
                s = s.replaceAll(c+"","");
                i--;
                continue;
            }
            i++;
        }
        
        if(s.length()==0)
            return '#';
        else return s.charAt(0);
        
    }
	public static void main(String[] args) {
		FirstAppearingOnce f = new FirstAppearingOnce();
		f.sb = new StringBuilder("");
		System.out.println(f.find());
	}
}
