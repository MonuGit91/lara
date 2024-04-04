package pack7;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class M9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list  = new ArrayList<Integer>();
		list.add(90);
		list.add(80);
		list.add(70);
		list.add(60);
		list.add(50);
		list.add(40);
		list.add(30);
		System.out.println(list);
		Spliterator<Integer> it = list.spliterator();
		it.forEachRemaining(t1 -> System.out.println(t1));
	}

}
