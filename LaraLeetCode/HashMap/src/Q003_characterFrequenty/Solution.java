package Q003_characterFrequenty;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		Map<Integer, Integer> map = new HashMap<>();
		for(int key : arr) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
//		Set<Integer> keys = map.keySet();
//		for(Integer key : keys) {
//			System.out.println(key + " : " + map.get(key));
//		}
		map.forEach((key, val)->{System.out.println(key+" : "+val);});
		
	}
}
