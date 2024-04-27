package Q004_twoSum;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		int arr[] = {1, 5, 3, 4, 6, 8};
		System.out.println(Arrays.toString(twoSum(arr, 8)));
	}
	public static int[] twoSum(int nums[], int target) {
		Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            int remaining = target-nums[i];
            if(map.containsKey(remaining)) {
                return new int[]{i, map.get(remaining)};
            }
            map.put(nums[i], i);
        }
        
        return new int[2];
	}

}
