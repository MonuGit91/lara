package pack7;

import java.util.TreeMap;

public class M14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("hello", 100);
		map.put("abc", 10);
		map.put("xyz", 0);
		map.put("test", 300);
		map.put("java", 100);
		map.put("btm", 140);
		System.out.println(map);
		System.out.println(map.headMap("test", true));
	}

}
