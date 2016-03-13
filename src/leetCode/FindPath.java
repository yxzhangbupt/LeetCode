package leetCode;

import java.util.ArrayList;


public class FindPath {
	
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public static ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        if(root==null) return result;
        int sum=0;
        findPath(root,target,tmp,result,sum);
        return result;
    }
    
    private static void findPath(TreeNode root,int target,ArrayList<Integer> tmp,ArrayList<ArrayList<Integer>> result,int sum){
        tmp.add(root.val);
        sum = sum+root.val;
        if(root.left==null&&root.right==null){
            if(sum==target){
                   result.add(new ArrayList<Integer>(tmp));
            }
            sum = sum - root.val;
            tmp.remove(tmp.size()-1);
            return;
        }
        if(root.left==null){
        	findPath(root.right,target,tmp,result,sum);
        	return;
        }
        else if(root.right==null){
        	findPath(root.left,target,tmp,result,sum);
        	return;
        }
        findPath(root.left,target,tmp,result,sum);
        findPath(root.right,target,tmp,result,sum);
        
        sum = sum - root.val;
        tmp.remove(tmp.size()-1);
        return;
    }
    
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(10);	
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(12);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		ArrayList<ArrayList<Integer>> result = findPath(root,22);
		System.out.println(result.get(0));
		System.out.println(result.get(1));
	}
}
