package pack5;

import java.util.ArrayList;

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(89);
		list.add(55);
		list.add(0);
		list.add(9);
		list.add(3);
		for(int i = 0; i < list.size(); i++) {
			int val = (Integer)list.get(i);
			System.out.println(val);
		}
	}

}
