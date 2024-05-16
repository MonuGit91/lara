package Q019_trapRainWater;

import java.util.Arrays;

class Solution2 {
	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println("output: " + trap(arr));
		
		int arr1[] = {4,2,0,3,2,5};
		System.out.println("\nInput: " + Arrays.toString(arr1));
		System.out.println("output: " + trap(arr1));
	}
	
    public static int trap(int[] height) {
        int n = height.length, left = 0, right = n-1;
        int leftMax = height[0], rightMax = height[n-1], water = 0;
        while(left <= right) {
            if(height[left] <= height[right]) {
                if(height[left] < leftMax) 
                    water += (leftMax-height[left]);
                else 
                    leftMax = height[left];
                left++;
            }
            else {
                if(height[right] < rightMax) 
                    water += (rightMax-height[right]);
                else 
                    rightMax = height[right];
                right--;
            }
        }
        return water;
    }
}



