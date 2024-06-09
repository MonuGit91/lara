package Q003_middleOfTheLinkedList;

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
class Solution {
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
		System.out.println(middleNode(head));
	}
}