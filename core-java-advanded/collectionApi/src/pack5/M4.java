package pack5;

import java.util.ArrayList;
import java.util.Iterator;

public class M4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(89);
		list.add(55);
		list.add(0);
		list.add(9);
		list.add(3);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + ", ");
		}
	}
}
