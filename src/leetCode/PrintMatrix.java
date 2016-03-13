package leetCode;

import java.util.ArrayList;
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer> al = new ArrayList<Integer>();
        int xstart = 0;
        int xend = matrix[0].length-1;
        int ystart = 0;
        int yend = matrix.length-1;
        printMatrix(al,matrix,xstart,xend,ystart,yend);
        return al;
    }
    
    private static void printMatrix(ArrayList<Integer> al,int [][] matrix,int xstart,int xend,int ystart,int yend){
        if(xend-xstart<0||yend-ystart<0)
            return;
        else if(xend==xstart){
        	for(int i=ystart;i<=yend;i++){
        		al.add(matrix[i][xstart]);
        	}
            return;
        }
        else if(yend==ystart){
        	for(int i=xstart;i<=xend;i++){
        		al.add(matrix[ystart][i]);
        	}
        	return;
        }
        else {
        	
        for(int i=xstart;i<=xend;i++){
            al.add(matrix[ystart][i]);
        }
        ystart++;
        for(int i=ystart;i<=yend;i++){
            al.add(matrix[i][xend]);
        }
        xend--;
        for(int i=xend;i>=xstart;i--){
            al.add(matrix[yend][i]);
        }
        yend--;
        for(int i=yend;i>=ystart;i--){
            al.add(matrix[i][xstart]);
        } 
        xstart++;
        }    
        printMatrix(al,matrix,xstart,xend,ystart,yend);
      	
    }
    
    public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
//    	int[][] a = {{1},{2},{3},{4},{5}};
		for (int t : printMatrix(a)) {
			System.out.print(t);
		}
	}
}
