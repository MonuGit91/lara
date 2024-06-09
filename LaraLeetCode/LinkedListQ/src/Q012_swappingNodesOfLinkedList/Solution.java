package Q012_swappingNodesOfLinkedList;

class Solution {
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
		
		public String toString() {
			return Integer.toString(this.val);
		}
	}

	public ListNode swapNodes(ListNode head, int k) {
		if (head == null || head.next == null)
			return head;

		ListNode temp = head, leftKth, rightKth;
		leftKth = rightKth = null;

		//moving to Left Kth
		for (int i = 1; i < k; i++) {
			temp = temp.next;
		}
		leftKth = temp;
		rightKth = head;
		
		//moving to Right Kth
		while (temp.next != null) {
			rightKth = rightKth.next;
			temp = temp.next;
		}
		
		//swap leftKth & rightKth
		int temp1 = leftKth.val;
		leftKth.val = rightKth.val;
		rightKth.val = temp1;

		return head;
	}
	public static void main(String[] args) {
		Solution obj = new Solution();
		ListNode head = obj.getLL();
		print(head);
		obj.swapNodes(head, 3);
		print(head);
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
		for (int i = 1; i <= 10; i++) {
			if (head == null) {
				head = new ListNode(i);
				tail = head;
			} else {
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}
		return head;
	}
}