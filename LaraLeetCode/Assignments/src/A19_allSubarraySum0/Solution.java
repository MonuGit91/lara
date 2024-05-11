package A19_allSubarraySum0;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {1, 2, -3, 1, 4, 0, -4, 2, 2, 5, -7};
		allSubarraySum0(arr);
	}
	public static void allSubarraySum0(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(i >= 2) {
				if(i-3 >= 0) {
					sum-=arr[i-3];
				}
				if(sum == 0) {
					System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i-2, i+1)));
				}
			}
			
		}
	}
}