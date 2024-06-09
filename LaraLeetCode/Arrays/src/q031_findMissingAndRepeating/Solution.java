package q031_findMissingAndRepeating;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {2, 2};
		System.out.println(Arrays.toString(sol.findTwoElement(arr, arr.length)));
		
		arr = new int[]{1, 3, 3};
		System.out.println(Arrays.toString(sol.findTwoElement(arr, arr.length)));
	}
	
	int[] findTwoElement(int arr[], int n) {
        int num[] = new int[n+1];
        int duplicate = -1;
        //count frequency
        for(int i = 0; i < n; i++) {
            num[arr[i]]++;
        }
        //find missing and duplicate
        int missing =  0;
        for(int i = 0; i < n+1; i++) {
            if(num[i] == 0 && i > 0) {
                missing = i;
            }
            if(num[arr[i]] ==2 ) {
                duplicate = arr[i];
            }
        }
        return new int[]{duplicate, missing};
    }
}
