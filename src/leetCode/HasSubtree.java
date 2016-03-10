package leetCode;


public class HasSubtree {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null) return false;
        if(root1==null) return false;
        else if(root1.val == root2.val){
        	if(isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right))
        	return true;
        }
        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    private boolean isSubtree(TreeNode root1,TreeNode root2){
        if(root2==null) return true;
        if(root1==null) return false;
        if(root1.val != root2.val)
            return false;
        else return isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right);
    }
}
