package leetCode;

import java.util.Arrays;

public class IsContinuous {
	public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length==0)
            return false;
		Arrays.sort(numbers);
        int len = numbers.length;
        int i = 0;
        int count0 = 0;
        while(i<len&&numbers[i] == 0){
            count0++;
            i++;
        }
        for(;i<len-1;i++){
            if(numbers[i]!=numbers[i+1]-1){
                count0 -= numbers[i+1]-1-numbers[i];
                if(count0<0||numbers[i]==numbers[i+1])
                    return false;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		IsContinuous is = new IsContinuous();
		int[] a = {1,0,0,1,0};
		System.out.println(is.isContinuous(a));
	}
}
