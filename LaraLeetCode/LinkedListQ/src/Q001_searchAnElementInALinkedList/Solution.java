package Q001_searchAnElementInALinkedList;

class Node {
	int val;
	Node next;
	Node(int val) {
		this.val = val;
	}
	public String toString() {
		return ""+val;
	}
}
public class Solution {
	private static String search(Node head, int k) {
		String ans = "NO";
		Node temp = head;
		while(temp != null) {
			if(temp.val == k) {
				ans = "YES";
				break;
			}
			temp = temp.next;
		}
		return ans;
	}
	public static void main(String[] args) {
		Node head = null,  tail = null;
		for(int i = 0; i < 10; i++) {
			if(head == null) {
				head = tail = new Node(i);
			}
			else {
				tail.next = new Node(i);
				tail = tail.next;
			}
		}
		System.out.println(search(head, 5));
	}

}
