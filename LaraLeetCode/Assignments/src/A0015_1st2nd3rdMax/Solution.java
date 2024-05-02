package A0015_1st2nd3rdMax;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 10, 4, 5, 9, 6, 7};
		System.out.println("input1: " + Arrays.toString(arr));
		find1st2nd3rdmax(arr);
		
		int arr1[] = {10, 50, 40, 80, 200, 150};
		System.out.println("input2: " + Arrays.toString(arr1));
		find1st2nd3rdmax(arr1);
	}
	public static void find1st2nd3rdmax(int arr[]) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = arr[i];
			}
			else if(arr[i] > secondMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
			}
			else if(arr[i] > thirdMax) {
				thirdMax = arr[i];
			}
		}
		
		System.out.println("firstMax: " + firstMax +
							"\nsecondMax: " + secondMax +
							"\nthirdMax: " + thirdMax);
		System.out.println();

	}
	
}
