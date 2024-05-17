package Q014_LeftRotateByK;

import java.util.Arrays;

public class Solution {
	public static void leftRotateByk(int arr[], int k) {
		k = k%arr.length;
//		reverse(arr, 0, arr.length-1);
//		reverse(arr, 0, arr.length-1-k);
//		reverse(arr, arr.length-k, arr.length-1);	
		
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}
	private static void reverse(int[] arr, int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		System.out.println("input:\n" + Arrays.toString(arr) + " K = 2");
		leftRotateByk(arr, 2);
		System.out.println("Output:\n"+Arrays.toString(arr));
	}
}
