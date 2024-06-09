package Q009_combinationSumII;

import java.util.*;

//By Sir
public class Solution1 {

	public static void main(String[] args) {
		int[] arr = { 10,1,2,7,6,1,5 };
		int target = 8;
		Solution1 sol = new Solution1();
		List<List<Integer>> ans = sol.combinationSum2(arr, target);
		ans.forEach(list -> System.out.println(list));

		System.out.println();

		arr = new int[] { 2, 5, 2, 1, 2 };
		target = 5;
		ans = sol.combinationSum2(arr, target);
		ans.forEach(list -> System.out.println(list));
	}
	private List<List<Integer>> ans = new ArrayList<>();
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		combinations(0, candidates, target, new ArrayList<>());
		return ans;
	}

	private void combinations(int index, int[] candidates, int target, List<Integer> ds) {
		if (target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			if (i > index && candidates[i] == candidates[i - 1])
				continue;
			if (candidates[i] > target)
				break;

			ds.add(candidates[i]);
			combinations(i + 1, candidates, target - candidates[i], ds);
			ds.remove(ds.size() - 1);
		}

	}

}
