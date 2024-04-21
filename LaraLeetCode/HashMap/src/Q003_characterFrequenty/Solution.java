package Q003_characterFrequenty;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1); 
			}
			else {
				map.put(arr[i], 1);
			}
		}
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
