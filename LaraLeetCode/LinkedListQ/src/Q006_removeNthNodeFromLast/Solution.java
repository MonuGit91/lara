package Q006_removeNthNodeFromLast;

public class Solution {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return Integer.toString(val);
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode preNth = null, nth = head, right = head;
        for(int i = 0; i < n; i++) {
            right = right.next;
            System.out.println(i+" "+right);
        }
        System.out.println(right);
        while(right != null) {
            preNth = nth;
            nth = nth.next;
            right = right.next;
        }
        if(preNth == null) 
            head = nth.next;
        else 
            preNth.next = nth.next;
		return head;
	}

	public static void main(String[] args) {
		ListNode head = null, tail = null;
		Solution obj = new Solution();
		
		for (int i = 1; i <= 10; i++) {
			if (head == null) {
				head = tail = new ListNode(i);
			} else {
				tail.next = new ListNode(i);
				tail = tail.next;
			}
		}

		obj.print(head);
		head = obj.removeNthFromEnd(head, 3);
		obj.print(head);
	}

	private void print(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
