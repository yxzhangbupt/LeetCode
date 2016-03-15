package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class GetMedian {
	static ArrayList<Integer> list = new ArrayList<Integer>();
    public void Insert(Integer num) {
    	list.add(num);
    }

    public Double getMedian() {
        Collections.sort(list);
        int size = list.size();
        if(size==0)
            return 0.0;
        if(size%2==1){
            return list.get(size/2)+0.0;
        }
        else return (list.get(size/2)+0.0+list.get(size/2-1))/2;
    }
    
    public static void main(String[] args) {
    	GetMedian g = new GetMedian();
    	for(int i=0;i<6;i++){
    		g.Insert(i);
    	}
    	System.out.println(g.getMedian());
	}
}
