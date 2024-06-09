package Q005_lastKthNode;

class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
	}
}
public class Solution {
	private static int lastKthNode(ListNode head, int k) {
		ListNode slow = head, fast = head;
		for(int i = 1; i < k; i++) {
			fast = fast.next;
		}
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.val;
		
	}
	
	public static void main(String[] args) {
		ListNode head = null, tail = null;
		for(int i = 1; i <= 10; i++) {
			if(head == null) 
				head = tail = new ListNode(i);
			else {
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}
		
		System.out.println(lastKthNode(head, 2));
	}

}
