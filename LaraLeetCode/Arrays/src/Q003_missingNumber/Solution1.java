package Q003_missingNumber;

import java.util.Arrays;

public class Solution1 {
	public int missingNumber(int[] nums) {
    	int missing = nums.length;
		
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] != i) {
    			missing = i;
    			break;//V.V.I
    		}
    	}
    	return missing;
    }

}
