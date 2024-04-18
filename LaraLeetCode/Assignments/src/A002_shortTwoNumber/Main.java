package A002_shortTwoNumber;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int arr[] = {4, 8, 4, 4, 4, 8, 8, 8, 8, 8, 4, 4, 4, 8, 8, 4, 8, 4};
		sol.shortTwoNumber(arr);
		System.out.println(Arrays.toString(arr));
	}
}
/*
input: [4, 8, 4, 4, 4, 8, 8, 8, 8, 8, 4, 4, 4, 8, 8, 4, 8, 4]
output: [4, 4, 4, 4, 4, 4, 4, 4, 4, 8, 8, 8, 8, 8, 8, 8, 8, 8]

TC: O(n)
*/