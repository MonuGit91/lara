package Q002_sortColor;

public class Solution4 {
	public void sortColors(int[] nums) {
        int red = 0, blue = 0, white = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) red++;
            else if(nums[i] == 1) white++;
            else blue++; 
        }
        int i = 0;
        while(red-- > 0) nums[i++] = 0;
        while(white-- > 0) nums[i++] = 1;
        while(blue-- > 0) nums[i++] = 2;
    }
}
