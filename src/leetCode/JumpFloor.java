package leetCode;

public class JumpFloor {
	public static int JumpFloor(int target) {
		if(target==0) return 0;
	    else if(target==1) return 1;
        else if(target==2) return 2;
//        else if(target==3) return 3;
	    else if(target<0) return 0;
        
        int[] array = new int[target+1];
	        array[0] = 0;
	        array[1] = 1;
        	array[2] = 2;
//        	array[3] = 3;
	        for(int i=3;i<target+1;i++){
	        	array[i] = array[i-1] + array[i-2];
	        }
	        
	        return array[target];
    }
	
	public static void main(String[] args) {
		System.out.println(JumpFloor(4));
	}
}
