package leetCode;

public class SortOddEven {
	public static void reOrderArray(int [] array) {
        int oddNum=0,evenNum=0;
        for(int i=0;i<array.length;i++){
            if(isOdd(array[i])){
                if(evenNum!=0){
                    int tmp = array[i];
                    int j;
                    for(j=i;j>oddNum;j--){
                    	array[j] = array[j-1]; 
                    }
                    array[j] = tmp;
                }
                oddNum++;
            }
            else evenNum++;
        }
    }
    
    private static boolean isOdd(int n){
        if(n%2==1)
            return true;
        else return false;
    }
    
    public static void main(String[] args) {
    	int[] a ={1,2,3,4,5,6,7,8};
    	reOrderArray(a);;
		for (int i : a) {
		System.out.print(i);
		}
	}
}
