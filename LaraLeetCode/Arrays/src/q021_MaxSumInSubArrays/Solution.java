package q021_MaxSumInSubArrays;

import java.util.*;
public class Solution {
	public static long pairWithMaxSum(long arr[])
    {
       long max = 0;
       for(int i = 1; i < arr.length; i++) {
           max = Math.max(max, arr[i]+arr[i-1]);
       }
       return max;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		long arr[] = {4, 3, 1, 5, 6};
		System.out.println(sol.pairWithMaxSum(arr));
		
		arr = new long[]{5, 4, 3, 1, 6};
		System.out.println(sol.pairWithMaxSum(arr));
	}
}
