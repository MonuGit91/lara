package Q001_quickSelect_KthMax;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution5 {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
