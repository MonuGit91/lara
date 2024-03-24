package pack1;

import java.util.ArrayList;

public class M4 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(909);
		list.add("abc");
		list.add("abc");
		list.add(true);
		list.add(909);
		list.add('t');
		System.out.println(list);
		System.out.println(list.contains("abc"));
		System.out.println(list.contains(90000));
		System.out.println(list);
	}
}
