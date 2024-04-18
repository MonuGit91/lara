package Q002_sortColor;

public class Solution {
	private void swap(int arr[], int i, int j) {		
		int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0, left = 0, right = nums.length-1;
        while(i <= right){
            if(nums[i] == 0) {
            	swap(nums, left, i);
            	left++;
            	i++;
            }
            else if(nums[i] == 2){
            	swap(nums, i, right);
            	right--;
            }
            else{
            	i++;
            }
        }
    }
}
