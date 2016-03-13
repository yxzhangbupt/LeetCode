package leetCode;

public class InversePairs {
	static int count=0;
    static int[] aux; 
    
    public static int find(int [] array) {
    	
        aux = new int[array.length];
        mergeSort(array,0,array.length-1);
        return count;
    }
    
    private static void mergeSort(int [] a,int lo,int hi){
        if(lo>=hi) return;
        int mid = lo+(hi-lo)/2;
        mergeSort(a,lo,mid);
        mergeSort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }
    
    private static void merge(int [] a,int lo,int mid,int hi){
        int i = lo,j = mid+1;
        int m = lo;
        for(int k=lo;k<=hi;k++){
            aux[k] = a[k];
        }
        while(m<=hi){
            if(i>mid){
                a[m++] = aux[j++];
            }
            else if(j>hi){
                a[m++] = aux[i++];
//                count ++;
                
            }
            else if(aux[i]>aux[j]){
                a[m++] = aux[j++];
                //��Ϊlo~mid,mid+1~hi�Ѿ�����aux[i]>aux[j]����aux[j]��i~mid��С�����Ժ�i~midÿһ�����������ԣ�����Ϊmid-i+1
                count += mid - i + 1;
            }
            else a[m++] = aux[i++];
        }
        
    }
    public static void main(String[] args) {
    	int[] a = {6,5,4,3,2,1};
//    	for(int s : a){
//    		System.out.print(s);
//    	}
		System.out.println(find(a));
//		for(int s : a){
//    		System.out.print(s);
//    	}
	}
}
