package pack1;

import java.util.ArrayList;

public class M3 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(909);
		list.add("abc");
		list.add("abc");
		list.add(true);
		list.add(909);
		list.add('t');
		System.out.println(list);
		list.set(2, "vijay");
		System.out.println(list);
	}
}
