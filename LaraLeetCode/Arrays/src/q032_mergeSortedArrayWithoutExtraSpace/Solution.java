package q032_mergeSortedArrayWithoutExtraSpace;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr1[] = {1,2,3,0,0,0}, m = 3;
		int arr2[] = {2,5,6}, n = 3;
		sol.merge(arr1, m, arr2, n);
		System.out.println(Arrays.toString(arr1));
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1;
        int k = n+m-1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else {
                 nums1[k--] = nums2[j--];
            }
        }
        while(i >= 0) nums1[k--] = nums1[i--];
        while(j >= 0) nums1[k--] = nums2[j--];
    }

}
