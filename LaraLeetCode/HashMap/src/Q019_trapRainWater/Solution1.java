package Q019_trapRainWater;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println("output: " + trap(arr));//6
		
		int arr1[] = {4,2,0,3,2,5};
		System.out.println("\nInput: " + Arrays.toString(arr1));
		System.out.println("output: " + trap(arr1));//9
	}
	public static int trap(int[] height) {
		int totalWater = 0, n = height.length;
		for(int i = 0; i < n; i++) {
			int leftMax = leftMaxHeight(height, i);
			int rightMax = rightMaxHeight(height, i);
			totalWater += Math.min(leftMax, rightMax)-height[i];
		}
		return totalWater;
	}
	private static int leftMaxHeight(int arr[], int start) {
		int max = 0;
		while(start >= 0) {
			max = Math.max(max, arr[start--]);
		}
		return max;
	}
	private static int rightMaxHeight(int arr[], int start) {
		int max = 0;
		while(start < arr.length) {
			max = Math.max(max, arr[start++]);
		}
		return max;
	}
}
