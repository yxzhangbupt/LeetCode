package leetCode;

public class ReverseLinkedList {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode ReverseList(ListNode head) {
		if(head==null) return null;
		ListNode first,next;
        next = new ListNode(head.val);
        while(head.next!=null){
            head = head.next;
            first = new ListNode(head.val);
            first.next = next;
            next = first;
        }
        return next;
    }
}
