package pack7;

import java.util.TreeSet;

public class M9 {

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
		System.out.println(set.headSet(100));
		System.out.println(set.headSet(100, true));

	}

}
/*
Q. how to consider even specified value also
ans. supply true with specified element. see line 20
*/