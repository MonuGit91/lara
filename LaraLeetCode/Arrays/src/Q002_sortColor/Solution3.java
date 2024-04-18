package Q002_sortColor;

public class Solution3 {
	class Solution {
	    public void sortColors(int[] nums) {
	        int n = nums.length;
	        int arr[] = new int[3];
	        for(int i = 0; i < n; i++) arr[nums[i]]++;
	        int j = 0;
	        for(int i = 0; i < 3; i++) {
	            while(arr[i] > 0) {
	                nums[j++] = i;
	                arr[i]--;
	            }
	        }
	    }
	}
}
