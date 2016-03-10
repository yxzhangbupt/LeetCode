package leetCode;

public class crazyJumpFloor {
	public static int JumpFloor(int target) {
		if(target==0) return 0;
	    else if(target==1) return 1;
        else if(target==2) return 2;
//        else if(target==3) return 3;
	    else if(target<0) return 0;
        
        int[] array = new int[target+1];
	        array[0] = 1;//作为一次跳上的+1
	        array[1] = 1;
        	array[2] = 2;
//        	array[3] = 3;
	        for(int i=3;i<target+1;i++){
	        	for(int j=0;j<i;j++){
	        		array[i] += array[j];
	        	}
	        }
	        
	        return array[target];
    }
	
	public static void main(String[] args) {
		System.out.println(JumpFloor(4));
	}
}
