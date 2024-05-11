package Extra004_maximumSubArraySum;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
		
		arr = new int[]{-2, 4};
		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int n = nums.length;
		int neg = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (neg < nums[i])
				neg = nums[i];
			sum += nums[i];
			if (sum <= 0)
				sum = 0;
			if (sum > max)
				max = sum;
		}
		return max == 0 ? neg : max;
	}

}
