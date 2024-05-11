package Extra005_longestConsecutiveSequence;

import java.util.*;

public class Solution1 {

	public static int longestConsecutive(int[] nums) {
		if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 0, count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == nums[i-1]+1) count++;
            else {
                longest = Math.max(longest, count);
                count = 1;
            }
        }
        return Math.max(longest, count);
    }
	public static void main(String[] args) {
		int arr[] = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(arr));
	}

}
