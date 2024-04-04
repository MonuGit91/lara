package pack7;

import java.util.HashMap;
import java.util.Map;

public class M8 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(9, "xyz");
		map.put(8,  "test");
		map.put(7,  "hi");
		map.put(6, "hello");
		
		System.out.println(map);
		map.merge(6,  "new", (v1, v2)->v1+v2);
		System.out.println(map);
	}
}
