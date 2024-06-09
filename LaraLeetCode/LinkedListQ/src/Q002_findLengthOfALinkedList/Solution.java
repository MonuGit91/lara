package Q002_findLengthOfALinkedList;


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
    public static int findLength(ListNode head) {
    	if(head == null) return 0;
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
        	count++;
        	temp = temp.next;
        }
        return count;
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
		System.out.println(findLength(head));
	}
}