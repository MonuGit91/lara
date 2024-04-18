package Q008_leftShiftByOne;

import java.util.Arrays;

public class Solution {
	public static void leftShiftByOne(int arr[]) {
		int temp = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
	public static void main(String[] args) {
		int arr[] = {5, 7, 2, 1, 4, 0, 8};
		System.out.println(Arrays.toString(arr));
		leftShiftByOne(arr);
		System.out.println(Arrays.toString(arr));
	}
}
