package pack4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

//***
class B1{
	int i;
	int j;
	B1(int i, int j){
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "("+i + " , " + j + ")";
	}
}
class ShortBasedOfI implements Comparator{
	public int compare(Object obj1, Object obj2) {
		return ((B1)obj1).i-((B1)obj2).i;
	}
}
class ShortBasedOfJ implements Comparator{
	public int compare(Object obj1, Object obj2) {
		return ((B1)obj1).j-((B1)obj2).j;
	}
}
public class M15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put(new B1(90, 0), "test1");
		map.put(new B1(9, 56), "test2");
		map.put(new B1(0, 125), "test3");
		map.put(new B1(190, 45), "test4");
		map.put(new B1(910, 50), "test5");
		map.put(new B1(901, 52), "test6");
		System.out.println(map);
		
		TreeMap map1 = new TreeMap(new ShortBasedOfI());
		map1.putAll(map);
		System.out.println(map1);
		
		TreeMap map2 = new TreeMap(new ShortBasedOfJ());
		map2.putAll(map);
		System.out.println(map2);
		
	}

}
/*
 * in map1 we are sorting based on i value 
 * in map2 we are sorting based on j value
 * 
 * if there more attrebute and our requirement is to sort based on every attribute then we should provide Comparator interface implementation for every attribute.
 * 
 * 
 */
