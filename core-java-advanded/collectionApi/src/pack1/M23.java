package pack1;

import java.util.ArrayList;

public class M23 extends ArrayList{
	public static void main(String[] args) {
		M23 list1 = new M23();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(91);
		list1.add(9);
		list1.add(590);
		list1.add(433);
		list1.add(123);
		list1.add(801);
		list1.add(290);
		System.out.println(list1);
		list1.removeRange(2, 6);//inclusive, exclusive
		System.out.println(list1);
	}
}
/*
- removeRange() is protected method so we can not use it directly.
  if we want to use it we have to extend ArrayList

*/