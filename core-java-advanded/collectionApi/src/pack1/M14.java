package pack1;

import java.util.ArrayList;

public class M14 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}

}
