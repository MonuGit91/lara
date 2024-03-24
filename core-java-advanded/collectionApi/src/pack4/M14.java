package pack4;

import java.util.HashMap;
import java.util.TreeMap;

class A1 implements Comparable{
	int i;
	A1(int i){
		this.i = i;
	}
	public String toString() {
		return "(" +i + ")";
	}
	public int compareTo(Object obj) {
		return i-((A1)obj).i;
	}
}
public class M14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put(new A1(90), "test1");
		map.put(new A1(9), "test2");
		map.put(new A1(0), "test3");
		map.put(new A1(190), "test4");
		map.put(new A1(190), "test4");
		map.put(new A1(910), "test5");
		map.put(new A1(901), "test6");
		System.out.println(map);
		
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
		
	}

}
