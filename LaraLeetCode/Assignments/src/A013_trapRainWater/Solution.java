package A013_trapRainWater;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println("output: " + trap(arr));
		
		int arr1[] = {4,2,0,3,2,5};
		System.out.println("\nInput: " + Arrays.toString(arr1));
		System.out.println("output: " + trap(arr1));
	}
	public static int trap(int[] height) {
		int leftMaxArr[] = leftToRightMax(height);
		int rightMaxArr[] = rightToLeftMax(height);
		int ans = 0;
		for (int i = 0; i < height.length; i++) {
			ans += Math.min(leftMaxArr[i], rightMaxArr[i]) - height[i];
		}
		return ans;
	}
	
	private static int[] leftToRightMax(int arr[]) {
		int maxHeight[] = new int[arr.length];
		maxHeight[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxHeight[i] = Math.max(maxHeight[i - 1], arr[i]);
		}
		return maxHeight;
	}

	private static int[] rightToLeftMax(int arr[]) {
		int maxHeight[] = new int[arr.length], n = arr.length;
		maxHeight[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			maxHeight[i] = Math.max(maxHeight[i + 1], arr[i]);
		}
		return maxHeight;
	}
}