package Q004_maxPorductOf3Numbers;

import java.util.Arrays;

public class Solution {
	public int maximumProduct(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
        int max1 = nums[n-1]*nums[n-2]*nums[n-3];
        int max2 = nums[0]*nums[1]*nums[n-1];
        int max = max1 > max2 ? max1 : max2;
        
        return max;
    }
}
