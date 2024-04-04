package pack7;

import java.util.ArrayList;
import java.util.List;

public class M4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(70);
		list.add(60);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(10);
		System.out.println(list);
		System.out.println("---------");
		list.sort((c1, c2) ->c1.compareTo(c2));
		System.out.println(list);
	}
}
