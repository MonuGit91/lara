package Q001_quickSelect_KthMax;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution4 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue();
        for(int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if(queue.size() > k) queue.poll();
        }
        return queue.peek();
    }
}
