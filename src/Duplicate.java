import java.util.Arrays;
public class Duplicate {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		duplication[0] = -1;
    	if(numbers==null||length==0)
            return false;
        Arrays.sort(numbers);
        for(int i=0;i<length-1;i++){
            if(numbers[i]==numbers[i+1]){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Duplicate d =new Duplicate();
		int[] a = {2,1,3,0,4};
		int[] b = new int[1];
		System.out.println(d.duplicate(a, a.length, b));
		System.out.println(b[0]);
	}
}
