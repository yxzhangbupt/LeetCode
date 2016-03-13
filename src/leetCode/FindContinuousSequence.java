package leetCode;

import java.util.ArrayList;

public class FindContinuousSequence {
	public ArrayList<ArrayList<Integer> > find(int sum) {
       	ArrayList<ArrayList<Integer>> listA = new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<sum;i++){
            int j=i,k = i;
            int tmp=0;
            while(tmp<sum){
                tmp += j;
                if(tmp==sum){
                    ArrayList<Integer> listB = new ArrayList<Integer>();
                    while(k <=j){
                        listB.add(k ++);
                    }
                    listA.add(listB);
                }
                j++;
            }
        } 
        
        return listA;
    }
	
	public static void main(String[] args) {
		FindContinuousSequence f = new FindContinuousSequence();
		System.out.println(f.find(9));
	}
}
