package Q008_mergeSortedLL;

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

	public ListNode getLL(int v) {
		ListNode head = null, tail = null;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == v) {
				if (head == null) {
					head = new ListNode(i);
					tail = head;
				} else {
					tail.next = new ListNode(i);
					tail = tail.next;
				}
			}
		}
		return head;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head1 = sol.getLL(0);
		ListNode head2 = sol.getLL(1);
		sol.print(head1);
		sol.print(head2);
		ListNode head = sol.mergeTwoLists(head1, head2);
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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head, tail;
		head = tail = new ListNode(-1);

		while (list1 != null && list2 != null) {
			tail.next = list1.val < list2.val ? list1 : list2;
			if (list1.val < list2.val) {
				list1 = list1.next;
			} else {
				list2 = list2.next;
			}
			tail = tail.next;
		}
		tail.next = list1 == null ? list2 : list1;
		return head.next;
	}

}
