package pack5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(89);
		list.add(55);
		list.add(0);
		list.add(9);
		list.add(3);
		ListIterator itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
	}

}
