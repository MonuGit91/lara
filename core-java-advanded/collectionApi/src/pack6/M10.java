package pack6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class C{
	int i;
	int j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "i = " + i + " j =" + j;
	}
}
class ShortOnI implements Comparator{
	public int compare(Object obj1, Object obj2) {
		Integer a = ((C)obj1).i;
		Integer b = ((C)obj2).j;
		return a.compareTo(b);
//		return ((C)obj1).i - ((C)obj2).i;
	}
}
class ShortOnJ implements Comparator{
	public int compare(Object obj1, Object obj2) {
		Integer a = ((C)obj1).i;
		Integer b = ((C)obj2).j;
		return a.compareTo(b);
//		return ((C)obj1).j - ((C)obj2).j;
	}
}
public class M10 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new C(90, 89));
		list.add(new C(9, 10));
		list.add(new C(0, 40));
		list.add(new C(80, 45));
		
		System.out.println(list);
		Collections.sort(list, new ShortOnI());
		System.out.println(list);
		Collections.sort(list, new ShortOnJ());
		System.out.println(list);
	}
}
