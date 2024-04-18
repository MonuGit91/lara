package Q001_quickSelect_KthMax;

import java.util.Arrays;

public class Solution6 {
	public int findKthLargest(int[] nums, int k) {
		int max = Integer.MIN_VALUE;
		while(k-- > 0) {
			int index = -1;
            max = Integer.MIN_VALUE;
			for(int i = 0; i < nums.length; i++) {
				if(max < nums[i]) {
					max = nums[i];
					index = i;
				}
			}
			if(index >= 0) nums[index] = Integer.MIN_VALUE;
		}
		return max;
	}
}
