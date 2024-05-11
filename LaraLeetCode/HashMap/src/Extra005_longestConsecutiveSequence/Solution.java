package Extra005_longestConsecutiveSequence;

import java.util.*;

public class Solution {
	public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for(int val : nums) 
            set.add(val);

        for(int val : nums) {
            if(!set.contains(val-1)) {
                int next = val+1, count = 1;
                while(set.contains(next)) {
                    count++;
                    next++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
	public static void main(String[] args) {
		int arr[] = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(arr));
	}

}
