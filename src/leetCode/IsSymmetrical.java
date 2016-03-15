package leetCode;

import java.util.ArrayList;

public class IsSymmetrical {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	boolean isSymmetrical(TreeNode pRoot){	
        if(pRoot==null)
        return false;
     	if(pRoot.left==null&&pRoot.right==null)
            return true;
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        mid(pRoot,list);
        int star = 0;
     	int mid = list.size()/2;
     	int last = list.size()-1;
     	while(star<last){
            if(list.get(star)==list.get(last)){
                star++;
                last--;
            }
            else return false;
        }
        return true;
    }
    private void mid(TreeNode root,ArrayList<TreeNode> list){
		if(root==null)
			return;
		if(root.left==null&&root.right==null){
			list.add(root);
			return;
		}
		
		mid(root.left,list);
		list.add(root);
		mid(root.right, list);
		return;
	}
}
