package leetCode;

import java.util.ArrayList;

public class FindFirstCommonNode {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode find(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null)
            return null;
// 		ArrayList<ListNode> list = new ArrayList<ListNode>();
//        while(pHead1!=null){
//        	list.add(pHead1);
//            pHead1 = pHead1.next;
//        }
//        
//        while(pHead2!=null){
//            if(list.contains(pHead2))
//                return pHead2;
//            pHead2 = pHead2.next;
//        }
//          return null;  
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
		int len1=0;
		int len2=0;
		while(pHead1!=null){
			pHead1 = pHead1.next;
			len1++;
		}
		while(pHead2!=null){
			pHead2 = pHead2.next;
			len2++;
		}
		int c = len1>len2?len1-len2:len2-len1;
		if(len1>len2){
			while(c!=0){
				head1 = head1.next;
				c--;
			}
		}
		else if(len1<len2){
			while(c!=0){
				head2 = head2.next;
				c--;
			}
		}
		
		while(head1!=null){
			if(head1==head2)
				return head1;
			head1 = head1.next;
			head2 = head2.next;
		}
		return null;
    }
}
