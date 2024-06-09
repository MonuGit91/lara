package Q015_subArrayWith0Sum;

import java.util.*;
public class Solution1 {

	static boolean findsum(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		map.put(0, 0);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (map.containsKey(sum)) {
				return true;
			}
			map.put(sum, i);
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, -1, -5 };
		System.out.println(findsum(arr));
	}

}
