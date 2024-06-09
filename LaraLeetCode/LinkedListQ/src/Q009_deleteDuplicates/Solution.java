package Q009_deleteDuplicates;

public class Solution {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		@Override
		public String toString() {
			return Integer.toString(val);
		}

	}

	public ListNode getLL() {
		ListNode head = null, tail = null;
		for (int i = 1; i <= 10; i++) {
			if (head == null) {
				head = new ListNode(i);
				tail = head;
			} else {
				tail.next = new ListNode(i);
				tail = tail.next;
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head = sol.getLL();
		sol.print(head);
		head = sol.deleteDuplicates(head);
		sol.print(head);
	}

	private void print(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp + " ");
			temp = temp.next;
		}

		System.out.println();
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode temp = head;
		while (temp != null && temp.next != null) {
			if (temp.val == temp.next.val)
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}
		return head;

	}

}
