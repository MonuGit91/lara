package Q017_GroupAnagrams;

import java.util.*;

public class Solution {
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String key = Arrays.toString(arr);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(str);
		}

		List<List<String>> ans = new ArrayList<>();
//		map.forEach((key, val) -> ans.add(val));
		ans.addAll(map.values());
		return ans;
	}

	public static void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(arr).forEach(list -> System.out.println(list));
	}

}
