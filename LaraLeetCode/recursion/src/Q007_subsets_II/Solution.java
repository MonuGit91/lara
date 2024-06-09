package Q007_subsets_II;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {1,2,2};
		List<List<Integer>> ans = sol.subsetsWithDup(arr);
		ans.forEach(System.out::println);	
	}
	
	Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(nums, 0, new ArrayList<Integer>());
        List<List<Integer>> ans = new ArrayList<>(set);
//        set.forEach(e -> ans.add(e));
        return ans;
    }

    private void subset(int[] nums, int i, List<Integer> list) {
        if (i == nums.length) {
            this.set.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        subset(nums, i + 1, list);
        list.remove(list.size() - 1);
        subset(nums, i + 1, list);
    }
    
}
