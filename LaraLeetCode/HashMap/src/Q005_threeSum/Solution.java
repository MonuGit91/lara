package Q005_threeSum;

import java.util.*;
public class Solution {
	Set<List<Integer>> set = new HashSet<>();
	public static void main(String[] args) {
		Solution obj = new Solution();
		int arr[] = {-1,0,1,2,-1,-4};
		System.out.println(obj.threeSum(arr));
	}
	
	public  List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		int target = 0;
		for(int i = 0; i < arr.length; i++) {
			int newTarget = 0 - arr[i];
			twoSum(arr, newTarget, i+1, arr[i]);
		}
		ans.addAll(set);
		return ans;
	}
	public void twoSum(int arr[], int target, int from, int x) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = from; i < arr.length; i++) {
        	int current = arr[i];
            if(map.containsKey(target-current)) {
            	List<Integer> list = new ArrayList<Integer>();
                list.add(x);
                list.add(arr[i]);
                list.add(target-current);
                Collections.sort(list);
                set.add(list);
            }
            map.put(arr[i], i);
        }
	}
}

