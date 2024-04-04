package pack1;

import java.util.ArrayList;

public class M4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList();
		list1.add(123);
		list1.add(10000);
		list1.add(15);
		list1.add(45);
		list1.forEach((element) -> System.out.println("consuming: " + element));
	}

}
