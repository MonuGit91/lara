package pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class M16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		Iterator it = list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
