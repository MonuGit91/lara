package test;

import java.util.*;

//Remove_All_Adjacent_Duplicates_In_String||
public class Main {
	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3};
		Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int val : nums) map.put(val, map.getOrDefault(val, 0)+1);
        System.out.println(map);
        Queue<Integer> queue = new PriorityQueue<>((val1, val2) -> map.get(val1).compareTo(map.get(val2)));
        queue.addAll(map.keySet());
        while(queue.size() > 2) {
        	queue.poll();
        }
        System.out.println(queue);
	}

}