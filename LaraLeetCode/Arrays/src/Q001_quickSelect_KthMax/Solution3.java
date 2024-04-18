package Q001_quickSelect_KthMax;

import java.util.*;

class Solution3 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue();
        for(int i = 0; i < nums.length; i++){
            if(pq.size() < k) pq.add(nums[i]);
            else{
                if(nums[i] > pq.peek()) {
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
        return pq.peek();
    }
}