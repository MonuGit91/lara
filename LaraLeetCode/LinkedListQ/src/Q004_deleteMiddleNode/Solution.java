package Q004_deleteMiddleNode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}

	public String toString() {
		return "" + val;
	}
}

public class Solution {
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
 			return null;

 		ListNode fast = head;
 		ListNode slow = head;
 		ListNode pre = null;

 		while (fast != null && fast.next != null) {
 			pre = slow;
 			slow = slow.next;
 			fast = fast.next.next;
 		}
 		pre.next = slow.next;
 		return head;
     }

	public static void main(String[] args) {
		ListNode head = null, tail = null;
		for (int i = 1; i <= 2; i++) {
			if (head == null)
				head = tail = new ListNode(i);
			else {
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}
		print(head);
		deleteMiddle(head);
		print(head);
	}

	public static void print(ListNode head) {
		while (head != null) {
			System.out.print(head+", ");
			head = head.next;
		}
		System.out.println();
	}
}
