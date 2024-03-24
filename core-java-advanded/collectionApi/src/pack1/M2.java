package pack1;

import java.util.ArrayList;


public class M2 {
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
		list.add(2, "vijay");
		System.out.println(list);
	}

}
//how to insert any element into the middle
/*
[909, abc, abc, true, 909, t]
[909, abc, vijay, abc, true, 909, t]



*/