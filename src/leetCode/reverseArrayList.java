package leetCode;

import java.util.ArrayList;
import java.util.Stack;

public class reverseArrayList {
	
	    public static class ListNode {
	        int val;
	        ListNode next = null;
	
	        ListNode(int val) {
	            this.val = val;
	        }
	    }
	
	
	    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        if(listNode==null)
	            return new ArrayList<Integer>();
	        
	        ListNode first = new ListNode(listNode.val);
	        ListNode next;
	    
	 		while(listNode.next!=null){
	            listNode = listNode.next;
	            next = first;
	            first = new ListNode(listNode.val);
	            first.next = next;
	        }
	        
	        ArrayList<Integer> reverse = new ArrayList<Integer>();
	        while(first!=null){
	            reverse.add(first.val);
	            first = first.next;
	        }
	        
	        return reverse;
	    }
	    
	    public static void main(String args[]){
	    	ListNode listNode = null;
//	    	ListNode listNode2 = new ListNode(2);
//	    	ListNode listNode3 = new ListNode(3);
//	    	listNode.next = listNode2;
//	    	listNode2.next = listNode3;
	      	System.out.println(printListFromTailToHead(listNode));
		}
}
