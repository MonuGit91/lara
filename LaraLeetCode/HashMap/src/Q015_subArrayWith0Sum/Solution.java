//	https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
package Q015_subArrayWith0Sum;

import java.util.*;

public class Solution {
	static boolean findsum(int arr[]) {
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		set.add(0);
		for (int val : arr) {
			sum += val;
			if (set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, -1, -5 };
		System.out.println(findsum(arr));
	}

}
