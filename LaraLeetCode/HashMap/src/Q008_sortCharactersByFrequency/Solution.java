package Q008_sortCharactersByFrequency;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		System.out.println(frequencySort("abbbcc"));
	}
	
	public static String frequencySort(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++)
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        
        Set<Character> keys = map.keySet();
        List<Character> list = new ArrayList<>(keys);
        
        Collections.sort(list, (c1, c2) -> map.get(c2)-map.get(c1));
        System.out.println(list);
        
        StringBuilder sb = new StringBuilder();
        
        for(Character key : list) {
        	sb.repeat(key, map.get(key));
        }
        
        return sb.toString();
    }
}
