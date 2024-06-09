package Q020_trapRainWater;

import java.util.Arrays;
import java.util.Stack;

public class Solution3 {
	public static int trap(int height[]) {
		int n = height.length, water = 0;
		Stack<Integer> stk = new Stack<>();

		for (int i = 0; i < n; i++) {
			
			while(!stk.isEmpty() && height[i] >= height[stk.peek()]) {
				int mid = stk.pop();
				if(stk.isEmpty()) {
					break;
				}
				int right = i, left = stk.peek();
				
				int waterHeight = (Math.min(height[right], height[left])) - height[mid];
				int width = right-left-1;
				water += waterHeight*width;
			}
			stk.push(i);
		}
		return water;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println("output: " + trap(arr));

		int arr1[] = { 4, 2, 0, 3, 2, 5 };
		System.out.println("\nInput: " + Arrays.toString(arr1));
		System.out.println("output: " + trap(arr1));
	}

}
