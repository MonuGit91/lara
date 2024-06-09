package q022_rearrangeArrayElementsBySign;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {3,1,-2,-5,2,-4};
		System.out.println(Arrays.toString(sol.rearrangeArray(arr)));
		
		arr = new int[] {-1,1};
		System.out.println(Arrays.toString(sol.rearrangeArray(arr)));
		
		arr = new int[] {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
		System.out.println(Arrays.toString(sol.rearrangeArray(arr)));
	}
	
	public int[] rearrangeArray(int[] nums) {
        int n = nums.length, idxPos = 0, idxNeg = 1;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            if(nums[i] >= 0) {
                ans[idxPos] = nums[i];
                idxPos += 2;
            } else {
                ans[idxNeg] = nums[i];
                idxNeg += 2;
            }
        }
        return ans;
    }
}
