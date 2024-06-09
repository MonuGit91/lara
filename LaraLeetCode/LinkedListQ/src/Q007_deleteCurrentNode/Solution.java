package Q007_deleteCurrentNode;

import java.time.LocalDateTime;

public class Solution {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return Integer.toString(val);
		}
	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public static void main(String[] args) {
		ListNode head = null, tail = null, node = null;
		Solution obj = new Solution();

		for (int i = 0; i < 10; i++) {
			if (head == null) {
				head = tail = new ListNode(i);
			} else {
				tail.next = new ListNode(i);
				tail = tail.next;
				if(i == 5) node = tail;
			}
		}

		obj.print(head);
		obj.deleteNode(node);
		obj.print(head);
	}

	private void print(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
