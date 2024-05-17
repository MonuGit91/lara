package Q003_missingNumber;

public class Solution {
    public int missingNumber(int[] nums) {    	
        int max = nums[0], actualSum = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
        	if(max < nums[i]) max = nums[i];
        	actualSum += nums[i];
        }
        int naturalSum = max*(max+1)/2;
        
        int dif = naturalSum-actualSum;
        
        return dif != 0 ? dif : (max == nums.length ? 0 : max+1);
    }
}
