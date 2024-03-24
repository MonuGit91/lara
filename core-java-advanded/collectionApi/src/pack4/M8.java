package pack4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map1 = new HashMap();
		map1.put("abc", 23344);
		map1.put(345, "try");
		map1.put(3.4, true);
		map1.put('a', "xyz");
		map1.put("test", 456);
		

		Set entries = map1.entrySet();
		for(Object obj : entries) {
			Entry entry =  (Entry)obj;
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
/*
Eentry is an inner interface of Map


*/