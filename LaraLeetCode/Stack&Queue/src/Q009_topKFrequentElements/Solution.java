package Q009_topKFrequentElements;

import java.util.*;
public class Solution {
	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		int[] ans = new int[k];
		int idx = 0, min = 0;
		
        for(int val : nums) {
        	map.put(val, map.getOrDefault(val, 0)+1);
        }
        
        pq.addAll(map.values());
        for(int i = 0; i < k; i++) { 
        	min = pq.poll();
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	int key = entry.getKey();
        	int val = entry.getValue();
        	if(val >= min) ans[idx++] = key;
        }
        
        return ans;
    }
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3}, k =2;
		System.out.println(Arrays.toString(topKFrequent(arr, k)));
	}

}
