package Q012_swappingNodesOfLinkedList;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Sol {
	public static void main(String[] args) {
		//List
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(2);
		ListNode n6 = new ListNode(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		System.out.println("initial content:");
		ListNode current = n1;
		while(current != null)
		{
			System.out.print(current.val + ", ");
			current = current.next;
		}
		System.out.println();
		Sol obj = new Sol();
		ListNode results = obj.swapNodes(n1, 2);
		System.out.println("final content");
		current = results;
		while(current != null)
		{
			System.out.print(current.val + ", ");
			current = current.next;
		}
	}
	public ListNode swapNodes(ListNode head, int k) {
		//step1
		ListNode firstKthNode = head;
		for(int i = 1; i < k; i++)
		{
			firstKthNode = firstKthNode.next;
		}
		//step2
		ListNode rightKthNode = head;
		ListNode rightMost = firstKthNode;
		while(rightMost.next != null)
		{
			rightMost = rightMost.next;
			rightKthNode = rightKthNode.next;
		}
		//step3
		int temp = firstKthNode.val;
		firstKthNode.val = rightKthNode.val;
		rightKthNode.val = temp;
		return head;
	}	
 }