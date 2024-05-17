package Q019_slidingWindowMaximum;

import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solutio1 {

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int ans[] = new int[(nums.length-k+1)];
//        Deque<Integer> dq = new LinkedList<>();
		Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0, j = 0; i < nums.length; i++) {
            if(!dq.isEmpty() && dq.peek() < i-k+1) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.offer(i);
            if(i >= k-1) {
            	ans[j++] = nums[dq.peekFirst()];
            }
        }
        return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		arr = maxSlidingWindow(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

}
