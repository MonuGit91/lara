package pack7;

import java.util.HashMap;
import java.util.Map;

public class M6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(9, "xyz");
		map.put(8,  "test");
		map.put(7,  "hi");
		map.put(6, "hello");
		
		System.out.println(map);
		map.put(8 , "new test");
		map.putIfAbsent(11, "new done");
		System.out.println(map);
	}

}
