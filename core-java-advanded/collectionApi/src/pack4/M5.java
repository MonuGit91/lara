package pack4;

import java.util.HashMap;
import java.util.Set;

public class M5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map1 = new HashMap();
		map1.put(null, 23344);
		map1.put(345, "try");
		map1.put(3.4, true);
		map1.put('a', null);
		map1.put(null, 456);
		

		Set keys = map1.keySet();
		for(Object key : keys) {
			System.out.println(key + " : " + map1.get(key));
		}
		System.out.println(keys);
	}
}
