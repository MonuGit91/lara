package Q003_characterFrequenty;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution1 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		Map<Integer, Integer> map = new HashMap<>();
		for(int key : arr) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		map.forEach((key, val) -> System.out.println(key + " " + val));
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		for(Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
