package Q012_maxErasureValue;

import java.util.*;

public class Solution {
	public static void main(String[] args) {

	}
	public int maximumUniqueSubarray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = nums.length, sum = 0, start = 0, maxSum = 0;
		for(int i = 0; i < n; i++) {
			if(map.containsKey(nums[i])) {
				maxSum = Math.max(maxSum, sum);
				while(map.containsKey(nums[i])) {
					sum -= nums[start];
					map.remove(nums[start++]);
				}
			}
			map.put(nums[i], i);
			sum += nums[i];
		}
		return Math.max(sum, maxSum);
	}
}
