package Q013_oddEvenLinkedList;


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
		
		public String toString() {
			return Integer.toString(this.val);
		}
	}
	
	public ListNode oddEvenList(ListNode head) {
		ListNode oddHead, oddTail, evenHead, evenTail;
		oddHead = oddTail = new ListNode(-1);
		evenHead = evenTail = new ListNode(-1);
		
		for(int i = 1; head != null; i++) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			
			if(i % 2 == 1) {
				oddTail.next = temp;
				oddTail = temp;
			}
			else {
				evenTail.next = temp;
				evenTail = temp;
			}			
		}
		oddTail.next = evenHead.next;
		return oddHead.next;
	}
	public static void main(String[] args) {
		Solution obj = new Solution();
		ListNode head = obj.getLL();
		print(head);
		obj.oddEvenList(head);
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
