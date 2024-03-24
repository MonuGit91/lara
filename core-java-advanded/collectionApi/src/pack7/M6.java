package pack7;

import java.util.Comparator;
import java.util.TreeSet;

class C{
	int i;
	int j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "(i = "+i+" j = " + j;
	}
}
class ShortOnI implements Comparator{
	public int compare(Object obj1, Object obj2) {
		return ((C)obj1).i-((C)obj2).i;
	}
}
class ShortOnJ implements Comparator{
	public int compare(Object obj1, Object obj2) {
		return ((C)obj1).j-((C)obj2).j;
	}
}
public class M6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<C> set = new TreeSet<C>(new ShortOnI());
		set.add(new C(90, 80));
		set.add(new C(901, 800));
		set.add(new C(190, 100));
		set.add(new C(290, 200));
		System.out.println(set);
		
		
		TreeSet<C> set2 = new TreeSet<C>(new ShortOnJ());
		set2.add(new C(90, 800));
		set2.add(new C(901, 100));
		set2.add(new C(190, 200));
		set2.add(new C(290, 100));
		System.out.println(set2);
	}

}
