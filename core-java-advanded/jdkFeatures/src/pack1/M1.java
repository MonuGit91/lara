package pack1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class M1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("hello");
		list1.add(10000);
		list1.add(1.4);
		list1.add(45);
		list1.add(true);
		ListConsumer consumer = new ListConsumer();
		list1.forEach(consumer);
	}
}
class ListConsumer implements Consumer{//functional interface
	public void accept(Object obj) {
		System.out.println("consuming: " + obj);
	}
}
/*

forEach() it can be used for all 5 collection interface



*/
