package Q004_removeLastNode;

public class Solution {
	public static Node removeLastNode(Node head) {
		if (head == null || head.next == null)
			return null;
		Node temp = head, preTemp = null;
		while (temp.next != null) {
			preTemp = temp;
			temp = temp.next;
		}
		preTemp.next = null;
		return head;
	}

	public static void main(String[] args) {
		Node head = null, tail = null;
		for (int i = 0; i < 10; i++) {
			if (head == null) {
				head = tail = new Node(i);
			} else {
				tail.next = new Node(i);
				tail = tail.next;
			}
		}

		print(head);
		head = removeLastNode(head);
		print(head);
	}

	private static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
