package Q003_missingNumber;

public class Solution3 {
	public int missingNumber(int[] nums) {
		int xor = 0;
        for(int i = 0; i < nums.length; i++) {
            xor = xor^nums[i]^i;
        }
        xor ^= nums.length; //V.V.I
        return xor;
    }
}
