package pack7;

import java.util.HashMap;
import java.util.Map;

public class M7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(9, "xyz");
		map.put(8,  "test");
		map.put(7,  "hi");
		map.put(6, "hello");
		
		System.out.println(map);
		map.compute(6,  (k, v)->v.concat("test    "));
		System.out.println(map);
	}
}
