package pack7;

import java.util.TreeSet;

public class M10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(900);
		set.add(90);
		set.add(120);
		set.add(140);
		set.add(90);
		set.add(20);
		System.out.println(set);
		System.out.println(set.tailSet(100));
		System.out.println(set.tailSet(100, false));
	}

}
