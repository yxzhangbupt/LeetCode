package leetCode;

public class VerifySquenceOfBST {
	public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
           	return false;
        return VerifySquenceOfBST(sequence,0,sequence.length-1);
            
    }
    
    private static boolean VerifySquenceOfBST(int [] sequence,int start,int end){
        if(start>=end) return true;
        int u = sequence[end];
        int i = start;
        int part;
        while(sequence[i]<u){
            i++;
        }
        part = i;
        while(i<end){
            if(sequence[i++]<u)
                return false;
        }
        
        return VerifySquenceOfBST(sequence,start,part-1)&&VerifySquenceOfBST(sequence,part,end-1);
    }
    
    public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(VerifySquenceOfBST(a));
	}
}
