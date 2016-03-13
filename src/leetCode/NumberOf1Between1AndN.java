package leetCode;

public class NumberOf1Between1AndN {
	public static int find(int n) {
	    int count=0;
	    int i = 1;
	    for(;i<=n;i*=10){
	    	int a = n/i;
	    	int b = n%i;
	    	count += (a+8)/10*i+((a%10==1)?b+1:0);
	    }
	    
	    return count;
    }
	
	public static void main(String[] args) {
		System.out.println(find(99));
	}
}
