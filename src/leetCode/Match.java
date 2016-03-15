package leetCode;

public class Match {
	 public boolean match(char[] str, char[] pattern)
	    {
	        if(str==null||pattern==null)
	            return false;
	        int len1 = str.length;
	        int len2 = pattern.length;
	        int i = len1-1;
	        int j = len2-1;
	        if(len1==0&&len2==0)
	        	return true;
	        if(len1!=0&&len2==0)
	        	return false;
	        if(len1==0&&pattern[j]=='*'){
	        	j--;
        		char d = pattern[j];
	        	while(j>0){
	        		j--;
	        		if(pattern[j]!=d)
	        			return false;
	        	}
	        	return true;
	        }
	        while(i>=0&&j>=0){
	            if(pattern[j]=='.'){
	                j = j - 1;
	                i = i - 1;
	                continue;
	            }
	            else if(pattern[j]=='*'){
	                if(j!=0){
	                    j = j-2;
	                    char c = pattern[j+1];
	                    while(i>=0&&str[i]==c){
	                        i--;
	                    }
	                    if(i<0||j<0) break;
	                }
	                else {
	                    j--;
	                	continue;
	                }
	            }
	            if(str[i]==pattern[j]){
	                i--;
	                j--;
	            }
	            
	            else return false;
	        }
	        
	        if(i>0||(j>=0&&pattern[j]!='*')){
	        	return false;
	        }
	        else if(pattern[j]=='*'){
	        	j--;
        		char d = pattern[j];
	        	while(j>0){
	        		j--;
	        		if(pattern[j]!=d)
	        			return false;
	        	}
	        	return true;
	        }
//	        if(){
//	        	return false;
//	        }
	        else return true;
	    }
	 
	 public static void main(String[] args) {
		 Match m = new Match();
//		 char[] str = {'a','a','a'};
		 char[] str = {'a'};
//		 char[] pattern = {'a','b','*','a','c','*','a'};
		 char[] pattern = {'a','b','*','a'};
		System.out.println(m.match(str, pattern));
	}
}
