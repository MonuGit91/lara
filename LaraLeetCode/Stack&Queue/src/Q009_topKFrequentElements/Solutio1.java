package Q009_topKFrequentElements;

import java.util.*;

public class Solutio1 {
	public static int[] topKFrequent(int[] nums, int k) {
   		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++)
		{
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		System.out.println(map);
	
	
		//step2
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		//System.out.println(map.values());
		for(Integer frequencyCount : map.values())
		{
			queue.add(frequencyCount);
		}
		System.out.println(queue);
		int minValue = Integer.MAX_VALUE;
		for(int i = 1; i <= k; i++)
		{
			minValue = queue.poll();
		}
		System.out.println(minValue);
	
		
		//step3
		int[] ans = new int[k];
		int index = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() >= minValue)
			{
				ans[index++] = entry.getKey();
			}
		}
		System.out.println(Arrays.toString(ans));
        return ans;
    }
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3}, k =2;
		System.out.println(Arrays.toString(topKFrequent(arr, k)));
	}
}
