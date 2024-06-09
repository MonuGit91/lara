package Q001_splitArrayLargestSum;

import java.util.*;

class Solution {
    private static boolean canSplitKTimes(int nums[], int mid, int k) {
        int sum = 0, count = 1;
        for(int val : nums) {
            sum += val;
            if(sum > mid) {
                sum = val;
                count++;
                if(count > k) return false; 
            }
        }
        return true;
    }
    public static int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().orElse(0);
        int high = Arrays.stream(nums).sum();
        int ans = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low+(high-low)/2;
            if(canSplitKTimes(nums, mid, k)) {
                high = mid-1;
                ans = mid;
            }
            else low = mid+1;
        }
        return ans;
    }
    
    public static void main(String[] args) {
		int arr[] = {7,2,5,10,8}, k = 2;
		System.out.println(splitArray(arr, k));//18
		
		arr = new int[] {1,2,3,4,5};
		System.out.println(splitArray(arr, k));//9
	}
}

