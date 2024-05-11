package A018_allSubArraySumK;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3}, k = 3;
		System.out.println("input: " + Arrays.toString(arr) + " k: " + k + "\nOutput:");
		allSubArraySumK(arr, k);
		
		arr = new int[]{1, 2, 3, -1, 4, 3, -2, 5}; k = 5;
		System.out.println("\ninput: " + Arrays.toString(arr) + " k: " + k + "\nOutput:");
		allSubArraySumK(arr, k);
	}

	public static void allSubArraySumK(int arr[], int k) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		int sum = 0;
		map.put(0, new ArrayList<Integer>());
		map.get(0).add(-1);

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (map.containsKey(sum - k)) {
				List<Integer> list = map.get(sum - k);
				for (int ind : list) {
					int subArr[] = Arrays.copyOfRange(arr, ind + 1, i + 1);
					System.out.println(Arrays.toString(subArr));
				}
			}
			if (!map.containsKey(sum)) {
				map.put(sum, new ArrayList<Integer>());
			}
			map.get(sum).add(i);
		}
	}
}
