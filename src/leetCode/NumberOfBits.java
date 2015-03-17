package leetCode;

import java.util.Scanner;

public class NumberOfBits{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	return Integer.bitCount(n);
    }
    
    public static void main(String args[])
    {
    	int n;
    	int i;
    	System.out.println("Please input a unsigned value");
    	Scanner in = new Scanner(System.in);
    	n = in.nextInt();
    	NumberOfBits num = new NumberOfBits();
       	i = num.hammingWeight(n);
       	System.out.println("The bits of this integer is "+i);
    	    	
    }
}
