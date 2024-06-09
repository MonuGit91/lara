package A20_SwapLast2Nodes;


class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
	}
	public String toString() {
		return ""+val;
	}
}

public class Solution {
	private static ListNode swapLast2Nodes(ListNode head) {
		if(head == null || head.next == null) return head;
		
		ListNode temp1 = head.next, temp2 = head, temp3 = null;
		while(temp1.next != null) {
			temp3 = temp2;
			temp2 = temp1;
			temp1 = temp1.next;
		}

		temp1.next = temp2;
		temp2.next = null;
		if(temp3 != null) {
			temp3.next = temp1;
			return head;
		}
		else {
			return temp1;
		}
	}
	public static void main(String[] args) {
		ListNode head = null, tail = null;
		for(int i = 1; i <=6; i++) {
			if(head == null) 
				head = tail = new ListNode(i);
			else {
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}
		printLL(head);
		head = swapLast2Nodes(head);
		printLL(head);
		
	}
	
	private static void printLL(ListNode head) {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}