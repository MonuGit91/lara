package pack3;

import java.util.ArrayList;

public class M12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList();
		list1.add(90);
		list1.add(910);
		list1.add(190);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(90);
		list2.add(910);
		list2.add(190);
		
		System.out.println(list1.equals(list2));
	}

}
/*
 * in every collection api class already overrided equals()
 * 
 * 
 */
