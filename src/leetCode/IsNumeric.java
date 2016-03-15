package leetCode;

import java.util.Arrays;

public class IsNumeric {
	 	public boolean isNumeric(char[] str) {
	        try {
				double d = Double.parseDouble(new String(str));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				return false;
			}
	        return true;
	    }
	 	
	 	public static void main(String[] args) {
	 		char[] c = {'1','0','0'};
			System.out.println(new IsNumeric().isNumeric(c));
		}
}
