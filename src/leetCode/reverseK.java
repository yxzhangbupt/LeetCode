package leetCode;

public class reverseK {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	 public ListNode FindKthToTail(ListNode head,int k) {
			int count=0;
	        ListNode tmp = head;
	        while(tmp!=null){
	            tmp = tmp.next;
	            count++;
	        }
	        if(k>count) return null;
	        int i = count-k+1;
	        while(i>1){
	            head = head.next;
	            i--;
	        }
	        return head;
	        
	    }
}
