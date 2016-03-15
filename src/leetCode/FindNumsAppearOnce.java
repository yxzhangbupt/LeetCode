package leetCode;

import java.util.Arrays;


public class FindNumsAppearOnce {
	public void find(int [] array,int num1[] , int num2[]) {
        int count = 0;
        Arrays.sort(array);
        for(int i=0;i<array.length;){
            if(i == array.length-1){
            	if(count<1){
            		num1[0] = array[i];
            	}
            	else 
                num2[0] = array[i];
                count++;
                break;
            }
            if(array[i]==array[i+1]){
                i += 2;
                continue;
            }
            else if(count==0){
            	 num1[0] = array[i];
            	 count++;
            }
                else{
                	num2[0] = array[i];
                	count++;
                } 
            i += 1;
        }
        
        if(count<2){
        	num1[0] = 0;
        	num2[0] = 0;
        }
    }
}
