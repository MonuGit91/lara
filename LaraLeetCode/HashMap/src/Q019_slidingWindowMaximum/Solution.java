package Q019_slidingWindowMaximum;

import java.util.Arrays;

public class Solution {
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int ans[] = new int[nums.length - k + 1];
		for (int i = 0; i < nums.length - k + 1; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = i; j < i + k; j++) {
				max = Math.max(max, nums[j]);
			}
			ans[i] = max;
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		arr = maxSlidingWindow(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

}
