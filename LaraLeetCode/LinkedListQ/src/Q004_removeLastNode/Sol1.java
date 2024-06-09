package Q004_removeLastNode;
class Node1 {
	int data;
	Node1 ref;
}

public class Sol1 {
	public static void main(String[] args) {
		Node1 n1 = new Node1();
		n1.data = 10;
		Node1 n2 = new Node1();
		n2.data = 110;
		Node1 n3 = new Node1();
		n3.data = 210;
		Node1 n4 = new Node1();
		n4.data = 102;
		Node1 n5 = new Node1();
		n5.data = 310;
		Node1 n6 = new Node1();
		n6.data = 103;

		n1.ref = n2;
		n2.ref = n3;
		n3.ref = n4;
		n4.ref = n5;
		n5.ref = n6;
		Sol1 obj = new Sol1();
		System.out.println("before removing:");
		Node1 current = n1;
		while (current != null) {
			System.out.print(current.data + ",");
			current = current.ref;
		}
		System.out.println();
		// n1=obj.removeLast(n1);
		removeLast(n1);
		System.out.println("after removing");
		current = n1;
		while (current != null) {
			System.out.print(current.data + ",");
			current = current.ref;
		}
		System.out.println();

	}

	static Node1 removeLast(Node1 head) {
		if (head == null || head.ref == null) {
			return null;
		}
		Node1 current = head;
		Node1 prev = head;
		while (current.ref != null) {
			prev = current;
			current = current.ref;
		}
		prev.ref = null;
		return head;
	}
}