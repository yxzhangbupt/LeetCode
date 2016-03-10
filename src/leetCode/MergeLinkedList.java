package leetCode;

public class MergeLinkedList {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode x,head;
        x = new ListNode(0);
        head = x;
        while(list1!=null||list2!=null){
            if(list1==null&&list2!=null){
                x.next = new ListNode(list2.val);
                x = x.next;
                list2 = list2.next;
                continue;
            }
            if((list2==null&&list1!=null)){
                x.next = new ListNode(list1.val);
                x = x.next;
                list1 = list1.next;
                continue;
            }  
            if(list1.val>=list2.val){
                x.next = new ListNode(list2.val);
                x = x.next;
                list2 = list2.next;
                continue;
            }
            if(list1.val<list2.val){
                x.next = new ListNode(list1.val);
                x = x.next;
                list1 = list1.next;
                continue;
            } 
        }
        
        return head.next;
    }
}
