package Q014_maxErasureValue;

//  https://leetcode.com/problems/maximum-erasure-value/description/
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int arr[] = {5,2,1,2,5,2,1,2,5};
		System.out.println(maximumUniqueSubarray(arr));
		
		arr = new int[]{4,2,4,5,6};
		System.out.println(maximumUniqueSubarray(arr));
	}
	public static int maximumUniqueSubarray(int[] nums) {
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
