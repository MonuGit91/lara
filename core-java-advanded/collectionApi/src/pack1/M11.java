package pack1;

import java.util.ArrayList;

public class M11 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		Object obj = list1.get(3);
//		Object obj = list1.get(30);
		System.out.println(obj);
	}

}
