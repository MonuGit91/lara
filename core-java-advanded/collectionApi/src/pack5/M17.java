package pack5;

import java.util.ArrayList;
import java.util.ListIterator;

public class M17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list);
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		
		list.add(100);//SuccessFull
		
		System.out.println();
		System.out.println(list);
	}

}
