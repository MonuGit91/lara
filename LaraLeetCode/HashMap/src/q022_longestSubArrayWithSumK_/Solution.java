package q022_longestSubArrayWithSumK_;

import java.util.*;

public class Solution{
    public static int lenOfLongSubarr (int arr[], int k) {
        int sum = 0, maxLen = 0, n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == k) 
            	maxLen = i+1;
            if(map.containsKey(sum-k)) {
            	maxLen = Math.max(maxLen, i-map.get(sum-k));
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
		int arr[] = {-1, 2, 3};
		System.out.println(lenOfLongSubarr(arr, 6));
		
		arr = new int[]{10, 5, 2, 7, 1, 9};
		System.out.println(lenOfLongSubarr(arr, 15));
	}
}
