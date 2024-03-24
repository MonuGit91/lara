package pack5;

import java.util.ArrayList;

public class M3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(89);
		list.add(55);
		list.add(0);
		list.add(9);
		list.add(3);
		for(Object obj : list) {
			int val = (Integer)obj;
			System.out.println(val);
		}
	}
}
