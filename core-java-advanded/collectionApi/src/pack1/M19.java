package pack1;

import java.util.ArrayList;

public class M19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		boolean obj = list1.remove(new Integer(901));
		System.out.println(list1);
		System.out.println(obj);
	}
}
