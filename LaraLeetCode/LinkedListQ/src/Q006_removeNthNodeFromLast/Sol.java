package Q006_removeNthNodeFromLast;

class ListNode {
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
}

public class Sol {
	public static void main(String[] args) {

		ListNode n1 = new ListNode(10);
		ListNode n2 = new ListNode(20);
		ListNode n3 = new ListNode(30);
		ListNode n4 = new ListNode(40);
		ListNode n5 = new ListNode(50);
		ListNode n6 = new ListNode(60);
		ListNode n7 = new ListNode(70);
		ListNode n8 = new ListNode(80);
		ListNode n9 = new ListNode(90);
		ListNode n10 = new ListNode(100);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;

		System.out.println("before remove");
		ListNode current = n1;
		while (current != null) {
			System.out.print(current.val + ",");
			current = current.next;
		}
		System.out.println();
		Sol obj = new Sol();
		n1 = obj.removeNthFromEnd(n1, 3);
		System.out.println("after remove");
		current = n1;
		while (n1 != null) {
			System.out.print(n1.val + ",");
			n1 = n1.next;
		}
		System.out.println();
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head, dommy = new ListNode(-1);
		for (int i = 1; i < n; i++) {
			fast = fast.next;
		}
		ListNode current = head, prev = dommy;
		prev.next = head;
		while (fast.next != null) {
			prev = current;
			current = current.next;
			fast = fast.next;
		}
		prev.next = current.next;
		return dommy.next;

	}
}