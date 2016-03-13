package leetCode;

import java.util.ArrayList;

public class PrintFromTopToBottom {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        if(root==null) return result;
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode x = queue.get(0);
            if(x.left!=null){
                queue.add(x.left);
            }
            if(x.right!=null){
                queue.add(x.right);
            }
            result.add(x.val);
            queue.remove(0);
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);	
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(1);
		root.left = node1;
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;
		ArrayList<Integer> result = PrintFromTopToBottom(root);
		System.out.println(result);
	}
}
