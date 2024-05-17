package Extra001_subarraySumEqualsK;

import java.util.*;

public class Solution1 {
	public static int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0, prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
		for(int i = 0; i < n; i++) {
			prefixSum += nums[i];			
            if(map.containsKey(prefixSum-k)) {
                count += map.get(prefixSum-k);// assume array=[1,-1,0], K=0 -> output: 3
/*
    			 (1)         (1)         (2)                
    sum: |--------10----------15---------10----------15---------|
  	     |---------.....5.....|	           

  	     |-------------------------------......5.....|
  		            ...............5..................            

*/
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
		}
        return count;
    }

	public static void main(String[] args) {
		int arr[] = {1,1,1};
		System.out.println(subarraySum(arr, 3));
		
		int arr1[] = {1,-1,0};
		System.out.println(subarraySum(arr1, 0));
		
		int arr2[] = {1,2,3};
		System.out.println(subarraySum(arr2, 3));
	}
}
