package leetCode;

public class TreeDepth {
	public  class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return find(root,0);
    }
    private int find(TreeNode root,int count){
    	if(root==null) return count;
        count ++;
        int a = find(root.right,count);
        int b = find(root.left,count);
       	count = a>=b?a:b;
        return count;
    }
    
    public static void main(String[] args) {
    	TreeDepth t = new TreeDepth();
    	TreeNode root = t.new TreeNode(1);
    	TreeNode root2 = t.new TreeNode(2);
    	TreeNode root3 = t.new TreeNode(3);
    	root.left = root2;
    	root.right = root3;
    	System.out.print(t.TreeDepth(root));
    	
	}
}
