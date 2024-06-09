package Q010_reverseLinkedList;

public class Solution2 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode newHead = null, current = head, next = null;
		while (current != null) {
			next = current.next;
			current.next = newHead;
			newHead = current;
			current = next;
		}
		return newHead;
	}

	public static void main(String[] args) {
		ListNode head = null, tail = null;
		for (int i = 1; i <= 10; i++) {
			if (head == null)
				head = tail = new ListNode(i);
			else {
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}
		Solution2 obj = new Solution2();
		print(head);
		head = obj.reverseList(head);
		print(head);
	}

	static void print(ListNode head) {
		while (head != null) {
			System.out.print(head + " ");
			head = head.next;
		}
		System.out.println();
	}

}
