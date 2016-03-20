package leetCode;

public class Convert2X2DoubleList {
	
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
//	public static TreeNode Convert(TreeNode pRootOfTree) {
//		if(pRootOfTree==null)
//            return null;
//        if(pRootOfTree.left ==null&&pRootOfTree.right==null){
//            return pRootOfTree;
//        }
//        
//        TreeNode left = Convert(pRootOfTree.left);
//        TreeNode p = left;
//        while(p!=null&&p.right!=null){
//            p = p.right;
//        }
//        
//        if(p!=null){
//            p.right = pRootOfTree;
//           	pRootOfTree.left = p;
//        }
//        
//        TreeNode right = Convert(pRootOfTree.right);
//        
//        if(right!=null){
//            right.left = pRootOfTree;
//           	pRootOfTree.right = right;
//        }
//        
//        return left!=null?left:pRootOfTree;
//    }
	public static TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode lastNodeInList=null;
        lastNodeInList = Convert(pRootOfTree,lastNodeInList);
        
        TreeNode headNodeinList = lastNodeInList;
        while(headNodeinList!=null&&headNodeinList.left!=null){
            headNodeinList = headNodeinList.left;
        }
        
        return headNodeinList;
    }
    
    private static TreeNode Convert(TreeNode root,TreeNode lastNodeInList){
        if(root==null)
            return lastNodeInList;
        
        TreeNode currentNode = root;
        
        if(currentNode.left!=null){
            lastNodeInList = Convert(currentNode.left,lastNodeInList);
        }
        
        currentNode.left = lastNodeInList;
        if(lastNodeInList!=null)
            lastNodeInList.right = currentNode;
        
        lastNodeInList = currentNode;
        
        if(currentNode.right!=null){
            lastNodeInList = Convert(currentNode.right,lastNodeInList);
        }
        
        return lastNodeInList;
    }

    
    public static void main(String[] args) {
    	TreeNode node1 = new TreeNode(10);
    	TreeNode node2 = new TreeNode(6);
    	TreeNode node3 = new TreeNode(14);
    	node1.left = node2;
    	node1.right = node3;
    	node2.left = new TreeNode(4);
    	node2.right = new TreeNode(8);
    	node3.left = new TreeNode(12);
    	node3.right = new TreeNode(16);
    	TreeNode node = Convert(node1);
    	
    	while(node!=null){
    		System.out.println(node.val);
    		node = node.right;
    	}
    	

	}
}
