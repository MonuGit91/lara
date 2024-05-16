package Q019_trapRainWater;

import java.util.Arrays;

public class Sol1 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 2, 1, 3, 2, 1, 2, 1 };
		System.out.println("nums:" + Arrays.toString(nums));
		
		// step1
		int[] leftMaxValues = new int[nums.length];
		for (int i = 1; i < nums.length; i++) {
			leftMaxValues[i] = Math.max(nums[i - 1], leftMaxValues[i - 1]);
		}
		System.out.println("lmax:" + Arrays.toString(leftMaxValues));
		
		// step2
		int[] rightMaxValues = new int[nums.length];
		for (int i = nums.length - 2; i > 0; i--) {
			rightMaxValues[i] = Math.max(nums[i + 1], rightMaxValues[i + 1]);
		}
		System.out.println("rmax:" + Arrays.toString(rightMaxValues));
		
		int sum = 0, minValue, trappedWaterAmount;
		for (int i = 0; i < nums.length; i++) {
			minValue = Math.min(leftMaxValues[i], rightMaxValues[i]);
			trappedWaterAmount = minValue - nums[i];
			if (trappedWaterAmount > 0) {
				sum += trappedWaterAmount;
			}
		}

		System.out.println(sum);
	}
}