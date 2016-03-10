package leetCode;

public class MinNumberInRotateArray {
	public static int minNumberInRotateArray(int [] array) {
        int length = array.length;
        if(length==0) return 0;
    	int[] newArray = new int[length];
        int min = min(array);
    	for(int i=min;i<length;i++){
            newArray[i-min] = array[i];
        }
        for(int i=0;i<min;i++){
            newArray[length-min+i] = array[i];
        }
        array = newArray;
        return array[0];
    }
    
    private static int min(int [] array){
        int min = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]<array[min])
                min = i;
        }
        return min;
    }
    
    public static void main(String[] args) {
		int[] array = {};
		System.out.println(minNumberInRotateArray(array));
//		for (int i : array) {
//			System.out.print(i);
//		}
		
	}
}
