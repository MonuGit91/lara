package Q011_palindromLinkedList;

public class Solution1 {
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
		Solution1 obj = new Solution1();
		ListNode head = obj.getLL();
		print(head);
		System.out.println(obj.isPalindrome(head));
	}

	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		// finding mid
		ListNode secondHalf = breakAndGetFromMid(head);

		// Reverse Second Half
		ListNode reversedHead = reverse(secondHalf);

		// checking palindrom
		while (head != null && reversedHead != null) {
			if (head.val != reversedHead.val)
				return false;
			head = head.next;
			reversedHead = reversedHead.next;
		}
		return true;
	}

	private ListNode reverse(ListNode head) {
		ListNode newHead = null, current = head, temp = null;
		
		while(current != null) {
			temp = current.next;
			current.next = newHead;
			newHead = current;
			current = temp;
		}
		return newHead;
	}

	private ListNode breakAndGetFromMid(ListNode head) {
		ListNode preSlow = null, slow = head, fast = head;
		while(fast != null && fast.next != null) {
			preSlow = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		preSlow.next = null;
		return slow;
	}

	static void print(ListNode head) {
		while (head != null) {
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
