package Q008_combinationSum;

import java.util.*;

//By Sir
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 obj = new Solution2();
		System.out.println(obj.combinationSum(new int[] {2, 3, 5}, 8));
	}
	private List<List<Integer>> ans = new ArrayList<>();
	public List<List<Integer>> combinationSum(int []candidates, int target) {
		List<Integer> ds = new ArrayList<>();
		combinations(0, candidates, target, ds);
		return ans;
	}
	private void combinations(int index, int []candidates, int target, List<Integer> ds) {
		if(index == candidates.length) {
			if(target == 0) {
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		if(candidates[index] <= target) {
			ds.add(candidates[index]);
			combinations(index, candidates, target-candidates[index], ds);
			ds.remove(ds.size()-1);
		}
		combinations(index+1, candidates, target, ds);
	}

}
