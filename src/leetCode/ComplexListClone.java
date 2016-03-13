package leetCode;

public class ComplexListClone {
	public static class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;

	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	public static RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode head = pHead;
        RandomListNode next;
        while(pHead!=null){
            next = pHead.next;
            pHead.next = new RandomListNode(pHead.label);
            pHead.next.next = next;
            pHead = next;
        }
        pHead = head;
        while(pHead!=null){
            next = pHead.random;
            //这里的处理要注意，random指针有可能为空，所以要做出判断，否则出现空指针异常
            if(next==null){
            	pHead.next.random = null;
            }
            else{
            	pHead.next.random = next.next;
            }
            pHead = pHead.next.next;
        }
        pHead = head.next;
        while(pHead.next!=null){
            pHead.next = pHead.next.next;
            pHead = pHead.next;
        }
        
        return head.next;
    }
	
	public static void main(String[] args) {
		RandomListNode node1 = new RandomListNode(1);
		RandomListNode node2 = new RandomListNode(2);
		RandomListNode node3 = new RandomListNode(3);
		RandomListNode node4 = new RandomListNode(4);
		RandomListNode node5 = new RandomListNode(5);
		node1.next = node2;
		node1.random = node3;
		node2.next = node3;
		node2.random = node5;
		node3.next = node4;
		node3.random = null;
		node4.next = node5;
		node4.random = node2;
		node5.next = null;
		node5.random = null;
		RandomListNode x = Clone(node1);
		RandomListNode y = x;
		while(x!=null){
			System.out.print(x.label);
			x = x.next;
		}
		System.out.println();
		while(y!=null){
			if(y.random!=null){
				System.out.print(y.random.label);
			}
			else System.out.print("#");
			y = y.next;
		}
	}
}
