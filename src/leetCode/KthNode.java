package leetCode;

import leetCode.IsSymmetrical.TreeNode;

	class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class KthNode {
	static TreeNode kNode;
	static int count=0;

	TreeNode kthNode(TreeNode pRoot, int k)
    {
		
	      try {
			mid(pRoot,k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return kNode;
		}
	    return null;
    }
	
	 private void mid(TreeNode pRoot,int k) throws Exception{
		 if(pRoot==null)
	            return;
      	mid(pRoot.left,k);
	        count++;
	        if(count==k){
	            kNode = pRoot;
	            throw new Exception();
	        }
	        mid(pRoot.right,k);
	    }
	 
	 public static void main(String[] args) {
		 		KthNode k = new KthNode();
		 	TreeNode root = new TreeNode(9);
	    	TreeNode node1 = new TreeNode(6);
	    	TreeNode node2 = new TreeNode(10);
	    	TreeNode node3 = new TreeNode(5);
	    	TreeNode node4 = new TreeNode(7);
	    	TreeNode node5 = new TreeNode(9);
	    	TreeNode node6 = new TreeNode(11);
	    	root.left = node1;
	    	root.right = node2;
	    	node1.left = node3;
	    	node1.right = node4;
	    	node2.left = node5;
	    	node2.right = node6;
	    	System.out.println(k.kthNode(root, 1));
	}
}
