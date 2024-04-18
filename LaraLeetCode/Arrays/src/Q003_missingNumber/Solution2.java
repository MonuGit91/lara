package Q003_missingNumber;

import java.util.Arrays;

public class Solution2 {
	public int missingNumber(int[] nums) {
		int missing = 0;
    	outer:
    	for(int i = 0; i <= nums.length; i++) {// <= is right
    		for(int j = 0; j < nums.length; j++) {
    			if(nums[j] == i) continue outer;
    		}
    		System.out.println(i);
    		missing = i;
    		break;
    	}
    	return missing;
    }
}
