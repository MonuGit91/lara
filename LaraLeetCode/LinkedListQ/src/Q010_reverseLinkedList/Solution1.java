package Q010_reverseLinkedList;

class Pair{
	ListNode head;
	ListNode tail;
	Pair(ListNode head) {
		this.head = head;
		this.tail = head;
	}
}
public class Solution1 {
	static Pair pair;
	private static ListNode reverse(ListNode head) {
		if(head == null) 
			return null;
		if(head.next == null) {
			pair = new Pair(head);
			return head;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		reverse(head);
		pair.tail.next = temp;
		pair.tail = temp;

		return pair.head;
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
		print(head);
		head = reverse(head);
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
