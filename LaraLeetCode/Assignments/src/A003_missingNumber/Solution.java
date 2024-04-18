package A003_missingNumber;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int arr[] = {12, 10, 4, 6, 7, 5, 11, 13, 8};
		System.out.println(Arrays.toString(arr) + " missing : " + missingNumber(arr));
		
		int arr1[] = {41, 36, 39, 44, 37, 42, 38, 43};
		System.out.println(Arrays.toString(arr) + " missing : " + missingNumber(arr1));
	}
	public static int missingNumber(int arr[]) {
		Arrays.sort(arr);
		int j = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != j) return j;
			else j++;
		}
		return -1;//no number is missing
	}
}
