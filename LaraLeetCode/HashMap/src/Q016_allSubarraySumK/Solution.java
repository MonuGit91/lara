//	https://leetcode.com/problems/subarray-sum-equals-k/
package Q016_allSubarraySumK;

import java.util.*;

public class Solution {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
		for(int i = 0; i < n; i++) {
			sum += nums[i];
            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);// asume array = [1,-1,0] -> output: 3
                /*

                k = 5
                arr: 1    3      6       1      1     3     -3     -2     2     1     2     5       7
                sum: 1    4      10      11     12    15    12     10     12    13    15    20     27
                	 |-------------------------------[15]  
                		        (10).........5.........|  (15-5)
                   
                     
                     |---------------------------------------------------------------[15]
                		                                           (10).......5........| (15-5)
                		         (10)........................5.........................| (15-5)

                */
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
		}
        return count;
    }
    public static void main(String[] args) {
		int arr[] = {1,1,1}, k = 2;
		System.out.println(subarraySum(arr, k));
				
		arr = new int[]{1,2,3}; k = 3;
		System.out.println(subarraySum(arr, k));
		
		arr = new int[]{2,3, 7, 4, 2, 1, 2, 2, 3, 1}; k = 7;
		System.out.println(subarraySum(arr, k));
	}
}
