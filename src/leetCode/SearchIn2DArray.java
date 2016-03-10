package leetCode;

public class SearchIn2DArray {
	public boolean Find(int [][] array,int target) {
//        boolean isExist;
	for(int i=0;i<array.length;i++){
        int aiLength = array[i].length;
        if(target>=array[i][0]&&target<=array[i][aiLength-1]&&binarySearch(array[i],target,0,aiLength-1))
            return true;
    }
        return false;
    }
    
    public static boolean binarySearch(int[] a,int t,int lo,int hi){
        if(lo>=hi) return false;
        int mid = lo+(hi-lo)/2;
        if(t<a[mid]) return binarySearch(a,t,lo,mid-1);
        else if(t>a[mid]) return binarySearch(a,t,mid+1,hi);
        else return true;
    }
    
    public static void main(String args[]){
    	
    int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    int[] b = {4,7,10,13};
    SearchIn2DArray s = new SearchIn2DArray();
    System.out.print(s.Find(a, 13));
//    System.out.print(binarySearch(b, 7, 0, 3));
    }
}
