package Q009_pairWithGivenDifference;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Integer arr[] = {5, 20, 3, 2, 50, 80}, n = 78;
		pairWithDifferenceK(arr, n);
	}
	private static void pairWithDifferenceK(Integer arr[], int n) {
		Map<Integer, Integer> map = new HashMap<>();
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(map.containsKey(num+n)) {
				System.out.println("pair with diffrence " + n + " :" + num + ", " + (n+num));
				return;
			}
			map.put(arr[i], i);
		}
		
		System.out.println("pair not found");
	}
}
