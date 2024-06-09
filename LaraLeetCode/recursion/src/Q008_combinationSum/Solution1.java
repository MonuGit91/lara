package Q008_combinationSum;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		int target = 7;
		Solution1 sol = new Solution1();
		List<List<Integer>> ans = sol.combinationSum(arr, target);
//		ans.forEach(list -> System.out.println(list));
		ans.forEach(System.out::println);
		
		System.out.println();
		
		arr = new int[]{2,3,5};
		target = 8;
		ans = sol.combinationSum(arr, target);
//		ans.forEach(list -> System.out.println(list));
		ans.forEach(System.out::println);
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		combinationSumRec(candidates, target, 0, ans, new ArrayList<Integer>());
		return ans;
	}
	private void combinationSumRec(int[] candidates, int target, int i, List<List<Integer>> ans, List<Integer> list) {
		if(i >= candidates.length || target <= 0) {
			if(target == 0) {
				ans.add(new ArrayList<>(list));
			}
			return;
		}
		
		list.add(candidates[i]);		
		combinationSumRec(candidates, target-candidates[i], i, ans, list);
		list.remove(list.size()-1);
		combinationSumRec(candidates, target, i+1, ans, list);
	}
}
