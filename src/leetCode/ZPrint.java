package leetCode;

import java.util.ArrayList;
import java.util.Stack;

import leetCode.Print.TreeNode;

public class ZPrint {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> outList = new ArrayList<ArrayList<Integer>>();
		if(pRoot==null)
			return outList;
		int i = 1;
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		s1.push(pRoot);
		do{
			ArrayList<Integer> inList = new ArrayList<Integer>();
			Stack<TreeNode> sf = s1.isEmpty()?s2:s1;
			Stack<TreeNode> se = s1==sf?s2:s1;
			while(!sf.isEmpty()){
				TreeNode node = sf.pop();
				if(i%2==1){
					if(node.left!=null)
						se.add(node.left);
					if(node.right!=null)
						se.add(node.right);
				}
				else {
					if(node.right!=null)
						se.add(node.right);
					if(node.left!=null)
						se.add(node.left);
				}
				inList.add(node.val);
			}
			i++;
			outList.add(inList);
		}while(!s1.isEmpty()||!s2.isEmpty());
		
		return outList;
    }
}
