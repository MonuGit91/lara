package q020_maximumSubarray;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(sol.maxSubArray(arr));
		
		arr = new int[]{1};
		System.out.println(sol.maxSubArray(arr));
		
	}

	public int maxSubArray(int[] nums) {
		int maxVal = Integer.MIN_VALUE, sum = 0, maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (nums[i] > maxVal)
				maxVal = nums[i];// it work for negative also
			if (sum < 0)
				sum = 0;
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum == 0 ? maxVal : maxSum;
	}
}
