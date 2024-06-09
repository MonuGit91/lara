package Q011_palindromLinkedList;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}

		public String toString() {
			return "" + val;
		}
	}

	public static void main(String[] args) {
		Solution obj = new Solution();
		ListNode head = obj.getLL();
		print(head);
		System.out.println(obj.isPalindrome(head));

	}

	public boolean isPalindrome(ListNode head) {

		// finding mid
		ListNode fast = head, slow = head, pre = null;
		while (fast != null && fast.next != null) {
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		pre.next = null;
		ListNode first = head, second = slow;
		
		print(head);
		
		// Reverse Second Half
		ListNode newHead = null, current = second, next = null;
		while (current != null) {
			next = current.next;
			current.next = newHead;
			newHead = current;
			current = next;
		}
		ListNode reversedHead = newHead;
		
		print(reversedHead);
		
		// checking palindrom
		while (head != null && reversedHead != null) {
			if (head.val != reversedHead.val)
				return false;
			head = head.next;
			reversedHead = reversedHead.next;
		}
		return true;
	}

	static void print(ListNode head) {
		while(head != null) {
			System.out.print(head + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	private ListNode getLL() {
		ListNode head = null, tail = null;
		for (int i = 1; i <= 5; i++) {
			if (head == null) {
				head = new ListNode(i);
				tail = head;
			} else {
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}
		for (int i = 4; i >= 1; i--) {
			tail.next = new ListNode(i);
			tail = tail.next;
		}
		return head;
	}
}
