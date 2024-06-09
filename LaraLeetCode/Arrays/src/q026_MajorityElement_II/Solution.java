package q026_MajorityElement_II;

import java.util.*;
import java.util.stream.*;
public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {3,2,3};
		System.out.println(sol.majorityElement(arr));
		
		arr = new int[]{1,2};
		System.out.println(sol.majorityElement(arr));
	}
	
	public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int key : nums) {
            map.put(key, map.getOrDefault(key, 0)+1);
            if(map.get(key) > n/3)
                set.add(key);
        }
        List<Integer> list = set.stream().map(e->e).collect(Collectors.toList());
        return list;
    }
}
