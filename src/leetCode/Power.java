package leetCode;

public class Power {
	public static double Power(double base, int exponent) {
		int n = exponent>0?exponent:-exponent;
		if(n==0) return 1;
		if(exponent==-1) return 1/base;
        if(base==0) return 0;      
        if(n==1) return base;
//        if(exponent==-1) return 1/base;
        double temp;
        double result;
        temp = Power(base,n/2);
        if(exponent%2==0){
            result = temp*temp; 
        }
        else {
            result = temp*temp*base;
        }
        return exponent>0?result:1/result;
  }
	
	public static void main(String args[])
	{
		System.out.println(Power(0, 1));
	}
}
