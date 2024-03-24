package pack7;

import java.util.TreeSet;

class B implements Comparable{
	int i;
	B(int i){
		this.i = i;
	}
	public String toString() {
		return "(i = "+i+")";
	}
	public int compareTo(Object obj) {
		return this.i - ((B)obj).i;
	}
}
public class M5 {
	public static void main(String[] args) {
		TreeSet<B> set = new TreeSet<B>();
		set.add(new B(90));
		set.add(new B(901));
		set.add(new B(190));
		set.add(new B(290));
		System.out.println(set);
	}
}

