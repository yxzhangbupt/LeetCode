package leetCode;

public class ReBuild2xTree {
	
	  public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	  public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
	    }
	    
	    private static TreeNode reConstructBinaryTree(int [] pre,int preStart,int preEnd,int [] in,int inStart,int inEnd){
	        if(preStart>preEnd||inStart>inEnd){
	            return null;
	        }
	        
	        TreeNode root = new TreeNode(pre[preStart]);
	        
	        for(int i=inStart;i<inEnd;i++){
	            if(pre[preStart]==in[i]){
	            	root.left = reConstructBinaryTree(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
	                root.right = reConstructBinaryTree(pre,preStart+i-inStart+1,preEnd,in,i+1,inEnd);
	            }
	        }
	        return root;  
	    }
	    
	    public static void main(){
	    	
	    }
}
