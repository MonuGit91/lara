package Q009_maxConsecutiveOnes;

import java.util.Arrays;

public class Solution {
	public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int val : nums) {
            if(val == 1) {
            	count++;
            } else {
            	max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
	public static void main(String[] args) {
//		int arr[] = {1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1};
//		System.out.println(Arrays.toString(arr));
//		System.out.println(findMaxConsecutiveOnes(arr));
//		
		int arr[] = {1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1};
		System.out.println(Arrays.toString(arr));
		System.out.println(findMaxConsecutiveOnes(arr));
	}
}
