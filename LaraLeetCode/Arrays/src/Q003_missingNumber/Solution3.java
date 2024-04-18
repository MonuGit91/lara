package Q003_missingNumber;

public class Solution3 {
	public int missingNumber(int[] nums) {
		int missing = 0^nums[0];
		for(int i = 1; i < nums.length; i++) {
			missing = missing^nums[i]^i;
		}
		missing = missing^nums.length;//V.V.I
    	return missing;	
    }
}
