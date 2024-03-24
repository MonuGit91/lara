package pack4;

import java.util.LinkedHashMap;

public class M12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map = new LinkedHashMap();
		map.put("abc", 34);
		map.put("abc1", 14);
		map.put("abc2", 31);
		map.put("abc3", 32);
		map.put("abc4", 24);
		map.put("abc5", 37);
		
		System.out.println(map);
		
	}

}
/*
 * output:
 * {abc=34, abc1=14, abc2=31, abc3=32, abc4=24, abc5=37}
 */
/*
Order is preserved in LinkedHashMpa
*/