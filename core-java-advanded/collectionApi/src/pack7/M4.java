package pack7;

import java.util.TreeSet;

class A{
	int i;
	A(int i){
		this.i = i;
	}
	public String toString() {
		return "(="+i+")";
	}
}
public class M4 {
	public static void main(String[] args) {
		TreeSet<A> set = new TreeSet<A>();
		set.add(new A(90));
		set.add(new A(901));
		set.add(new A(190));
		set.add(new A(290));
		System.out.println(set);
	}
}
/*
ClassCastException

because either class A should be comparable or 
we have to provide comparater

*/