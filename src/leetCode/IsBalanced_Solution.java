package leetCode;



public class  IsBalanced_Solution{
    public boolean isBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        int diff = left - right;
        if(diff<-1||diff>1)
            return false;
        return isBalanced_Solution(root.left)&&isBalanced_Solution(root.right);
    }
     private int TreeDepth(TreeNode root) {
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
}
