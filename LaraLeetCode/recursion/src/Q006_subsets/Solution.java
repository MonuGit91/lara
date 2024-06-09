package Q006_subsets;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {1,2,2};
		List<List<Integer>> ans = subsets(arr);
		ans.forEach(System.out::println);
	}
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(nums, 0, ans, new ArrayList<Integer>());
        return ans;
    }
    private static void generate(int[] nums, int idx, List<List<Integer>> ans, List<Integer> list) {
        if(idx == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        generate(nums, idx+1, ans, list);
        list.remove(list.size()-1);
        generate(nums, idx+1, ans, list);
    }
}
