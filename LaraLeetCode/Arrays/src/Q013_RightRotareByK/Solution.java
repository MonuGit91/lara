package Q013_RightRotareByK;

import java.util.Arrays;

public class Solution {
	public static void rightRotateByK(int[] arr, int k) {
		k = k%arr.length;
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
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
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(arr));
		rightRotateByK(arr, 4);
		System.out.println(Arrays.toString(arr));
	}
}
/*

k = k%arr.length //it should be first statement in reverse()
reverse(arr, 0, arr.length-1)
reverse(arr, 0, k-1)
reverse(arr, k, arr.length-1)
*/