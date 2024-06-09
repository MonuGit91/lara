package Q009_combinationSumII;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		Solution sol = new Solution();
		List<List<Integer>> ans = sol.combinationSum2(arr, target);
		ans.forEach(list -> System.out.println(list));

		System.out.println();

		arr = new int[] { 2, 5, 2, 1, 2 };
		target = 5;
		ans = sol.combinationSum2(arr, target);
		ans.forEach(list -> System.out.println(list));
	}

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> ans = new ArrayList<>();
		combinationSumRec(candidates, target, 0, ans, new ArrayList<Integer>());
		return ans;
	}

	private void combinationSumRec(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> list) {
		if (target == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}

		for (int i = idx; i < candidates.length; i++) {
			if (i > idx && candidates[i] == candidates[i - 1])
				continue;
			if (target - candidates[i] < 0)
				break;

			list.add(candidates[i]);
			combinationSumRec(candidates, target - candidates[i], i + 1, ans, list);
			list.remove(list.size() - 1);
		}
	}
}
