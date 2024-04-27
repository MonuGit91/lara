package Q004_twoSum;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int arr[] = {1, 5, 3, 4, 6, 8};
		System.out.println(Arrays.toString(twoSum(arr, 8)));
	}
	public static int[] twoSum(int nums[], int target) {
		int ans[] = new int[2];
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
					break;
				}
			}
		}
		return ans;
	}
}
