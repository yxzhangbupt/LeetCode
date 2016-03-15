package leetCode;

import java.util.ArrayList;
import java.util.Queue;

public class Print {
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
		ArrayList<TreeNode> list1 = new ArrayList<TreeNode>();
		ArrayList<TreeNode> list2 = new ArrayList<TreeNode>();
		list1.add(pRoot);
		do{
			ArrayList<Integer> inList = new ArrayList<Integer>();
			ArrayList<TreeNode> listf = list1.isEmpty()?list2:list1;
			ArrayList<TreeNode> liste = list1==listf?list2:list1;
			while(!listf.isEmpty()){
				TreeNode node = listf.remove(0);
				if(node.left!=null)
					liste.add(node.left);
				if(node.right!=null)
					liste.add(node.right);
				inList.add(node.val);
			}
			outList.add(inList);
		}while(!list1.isEmpty()||!list2.isEmpty());
		
		return outList;
    }
}
