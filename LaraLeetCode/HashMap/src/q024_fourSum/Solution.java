package q024_fourSum;

import java.util.*;
public class Solution {
	Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> fourSum(int[] arr, int tar) {
        long target = tar;
//        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
			    twoSum(arr, target-arr[i]-arr[j], j+1, arr[i], arr[j]);
		    }
        }
//		for(List<Integer> list : set) ans.add(list);
		List<List<Integer>> ans = new ArrayList<>(set);
		set = new HashSet<>();
		
		return ans;
	}
	public void twoSum(int arr[], long target, int from, int x, int y) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Long, Integer> map = new HashMap<>();
        long current;
        for(int i = from; i < arr.length; i++) {
        	current = arr[i];
            if(map.containsKey(target-current)) {
                // list = new ArrayList<Integer>(Arrays.asList(x, y, (int)current, (int)(target-current)));
                list = Arrays.asList(x, y, (int)current, (int)(target-current));
                Collections.sort(list);
                set.add(list);
            }
            map.put(current, i);
        }
        
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {1,0,-1,0,-2,2}, target = 0;
		sol.fourSum(arr, target).forEach(System.out::println);
		
		System.out.println();
		
		arr = new int[]{2,2,2,2,2};
		target = 8;
		sol.fourSum(arr, target).forEach(System.out::println);
	}

}
