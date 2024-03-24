package pack7;

import java.util.TreeSet;

public class M8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(900);
		set.add(90);
		System.out.println(set);
		System.out.println(set.ceiling(20));
		System.out.println(set.ceiling(30));
		System.out.println(set.ceiling(150));
		System.out.println(set.ceiling(900));
	}
}
