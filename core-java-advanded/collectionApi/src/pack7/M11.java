package pack7;

import java.util.HashSet;
import java.util.TreeSet;

public class M11 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(900);
		set.add(90);
		set.add(120);
		set.add(140);
		set.add(90);
		set.add(20);
		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<Integer>(set);
		System.out.println(set1);
	}
}
