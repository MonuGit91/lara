package Q008_combinationSum;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		int target = 7;
		Solution sol = new Solution();
		List<List<Integer>> ans = sol.combinationSum(arr, target);
		ans.forEach(list -> System.out.println(list));
		
		System.out.println();
		
		arr = new int[] { 2, 3, 5 }; 
		target = 8;
		ans = sol.combinationSum(arr, target);
		ans.forEach(list -> System.out.println(list));
	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		combinationSumRec(candidates, target, 0, ans, new ArrayList<Integer>());
		return ans;
	}

	private void combinationSumRec(int[] candidates, int target, int i, List<List<Integer>> ans,
			ArrayList<Integer> list) {
		if (i == candidates.length || target < 0) {
			if (target == 0) {
				ans.add(new ArrayList<>(list));
			}
			return;
		}

		combinationSumRec(candidates, target, i + 1, ans, list);
		int j = 1;
		while (candidates[i] * j <= target) {
			list.add(candidates[i]);
			combinationSumRec(candidates, target - candidates[i] * j, i + 1, ans, list);
			j++;
		}
		while (j > 1) {
			list.remove(list.size() - 1);
			j--;
		}
	}
}
