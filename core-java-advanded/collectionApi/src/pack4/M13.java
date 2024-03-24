package pack4;

import java.util.TreeMap;

public class M13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap map = new TreeMap();
		map.put(12, "test");
		map.put(1,  "test3");
		map.put(120, "abc");
		map.put(10,  "xyz");
		map.put(2,  "500");
		System.out.println(map);
	}

}
/*
{1=test3, 2=500, 10=xyz, 12=test, 120=abc}
*/
/*
sorting based on the key
*/