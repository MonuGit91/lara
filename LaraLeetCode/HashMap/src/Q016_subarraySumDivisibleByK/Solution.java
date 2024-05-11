package Q016_subarraySumDivisibleByK;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int arr[] = new int[]{2,3, 7, 4, 2, 1, 2, 2, 3, 1}, k = 7;
		System.out.println(subarraysDivByK(arr, k));
	}
	
	public static int subarraysDivByK(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if(remainder < 0) remainder += k;
            if(map.containsKey(remainder)) {
                count += map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
