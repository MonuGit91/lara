package Q013_maxConsecutive1AfterRemovingKzeros;

public class Solution {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		System.out.println(longestOnes(arr, 2));
	}

	public static int longestOnes(int[] nums, int k) {
		int n = nums.length;
		int i = 0, j = 0, zeroCount = 0, maxOne = 0;
		for (; i < n; i++) {
			if (nums[i] == 0)
				zeroCount++;
			if (zeroCount > k) {
				maxOne = Math.max(maxOne, i - j);
				while (zeroCount > k) {
					if (nums[j] == 0)
						zeroCount--;
					j++;
				}
			}
		}
		maxOne = Math.max(maxOne, i - j);
		return maxOne;
	}
}
