package pack4;

import java.util.HashMap;

public class M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map1 = new HashMap();
		map1.put(null, 23344);
		map1.put(345, "try");
		map1.put(3.4, true);
		map1.put('a', null);
		map1.put(null, 456);
		System.out.println(map1);
		String s1 = (String)map1.get(345);
		System.out.println(s1);
		String s2 = (String)map1.get("xyz");
		System.out.println(s2);
	}
}
