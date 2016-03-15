package leetCode;

import java.util.ArrayList;
import java.util.Iterator;

public class GetNext {
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	public TreeLinkNode getNext(TreeLinkNode pNode)
    {
		TreeLinkNode root = pNode;
		TreeLinkNode r
        while(root.next!=null){
            root = root.next;
        }
        ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
        mid(root,list);
        Iterator<TreeLinkNode> itr = list.iterator();
        while(itr.hasNext()){
        	if(itr.next()==pNode){
        		return  (r=itr.next())==null?null:r;
        		
        	}
        		
        }
        return null;
        	
    }
	
	private void mid(TreeLinkNode root,ArrayList<TreeLinkNode> list){
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
