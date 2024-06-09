package q023_nextPermutation;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {1,2,3};
		sol.nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
		
		arr = new int[] {3,2,1};
		sol.nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
		
		arr = new int[] {1,1,5};
		sol.nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
	}

	 public void nextPermutation(int[] nums) {
	        int n = nums.length, dip = -1;
	        //finding dip
	        for(int i = n-2; i >= 0; i--) {
	            if(nums[i] < nums[i+1]) {
	                dip = i;
	                break;
	            }
	        }
	        
	        // if array is sorted in reverse order then next perputation is reverse arr
	        if(dip == -1) {
	            reverse(nums, 0, n-1);
	            return;
	        }

	        // if there is a dip then swap with just grater element
	        for(int i = n-1; i > dip; i--) {
	            if(nums[i] > nums[dip]) {
	                swap(nums, i , dip);
	                break;
	            }
	        }

	        //reverse form dip+1 to last
	        reverse(nums, dip+1, n-1);
	    }
	    private void reverse(int arr[], int i, int j) {
	        while(i < j) 
	            swap(arr, i++, j--);
	    }
	    private void swap(int arr[], int i, int j) {
	        if(arr[i] == arr[j])
	            return;
	        arr[i] = arr[i] ^ arr[j];
	        arr[j] = arr[i] ^ arr[j];
	        arr[i] = arr[i] ^ arr[j];
	    }
}
