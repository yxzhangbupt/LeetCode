package leetCode;

import java.util.ArrayList;

public class FindNumbersWithSum {
	public ArrayList<Integer> find(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(array==null||array.length==0||array[array.length-1]<sum/2)
            return list;
        int len = array.length;
        int m=-1;
        int n=-1;
        int muti=sum*sum;
        int[] result = new int[2];
		for(int i=0;i<len;i++){
            if(array[i]>=sum/2){
                if(m==-1){
                    m = i;
                }
            }
            if(array[i]>=sum){
                if(n==-1){
                    n = i;
                    break;
                }
            }
        }
		if(n==-1){
			n = len-1;
		}
        int end = n;
        for(int i=0;i<=m;i++){
            int j = end;
            while(j>m){    
                if(array[i]+array[j]==sum){
                    if(array[i]*array[j]<muti){
                        muti = array[i]*array[j];
                        result[0] = array[i];
                        result[1] = array[j];
                    }
 				end = j;
                break;
                }
                j--;
            }
        }
        if(result[0]!=0){
        	list.add(result[0]);
            list.add(result[1]);
        }
        return list;
    }
	public static void main(String[] args) {
		FindNumbersWithSum f = new FindNumbersWithSum();
		int[] a = {0,1,2,3,4,5,6};
		System.out.println(f.find(a, 0));
	}
}
