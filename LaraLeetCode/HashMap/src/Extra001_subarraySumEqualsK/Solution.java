package Extra001_subarraySumEqualsK;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {1,1,1};
		System.out.println(subarraySum(arr, 3));
		
		int arr1[] = {1,-1,0};
		System.out.println(subarraySum(arr1, 0));
		
		int arr2[] = {1,2,3};
		System.out.println(subarraySum(arr2, 3));
	}
	 public static int subarraySum(int[] nums, int k) {
		 int n = nums.length, count = 0;
		 for(int i = 0; i < n; i++) {
			 int sum = 0;
			 for(int j = i; j < n; j++) {
				 sum += nums[j];
				 if(sum == k) {
					 count++;
				 }
			 }
		 }
		 return count;
	 }
}
