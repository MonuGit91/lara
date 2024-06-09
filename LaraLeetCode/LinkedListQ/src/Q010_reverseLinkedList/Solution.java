package Q010_reverseLinkedList;

public class Solution {
	private static ListNode reverse(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode tail = head;
		head = head.next;
		tail.next = null;
		ListNode newHead = reverse(head);
		ListNode temp = newHead;
		
		while(temp.next != null) 
			temp = temp.next;
		temp.next = tail;
		
		return newHead;
	}
	
	public static void main(String[] args) {
		ListNode head = null, tail = null;
		for(int i = 1; i <= 3; i++) {
			if(head == null) 
				head = tail = new ListNode(i);
			else {
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}
		print(head);
		head = reverse(head);
		print(head);
	}
	
	static void print(ListNode head) {
		while(head != null) {
			System.out.print(head + " ");
			head = head.next;
		}
		System.out.println();
	}

}
