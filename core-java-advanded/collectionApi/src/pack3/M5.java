package pack3;

import java.util.HashSet;

public class M5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		System.out.println(set.add(new StringBuffer("hello")));
		System.out.println(set.add(new StringBuffer("hello")));
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("xyz")));
		System.out.println(set.add(new StringBuffer("xyz")));
		System.out.println(set);
	}

}
