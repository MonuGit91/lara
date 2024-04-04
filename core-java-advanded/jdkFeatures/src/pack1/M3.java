package pack1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class M3 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList();
		list1.add(123);
		list1.add(10000);
		list1.add(15);
		list1.add(45);
		list1.add(345);
		ListConsumer1 consumer = new ListConsumer1() {
			public void accept(Object obj) {
				System.out.println("consuming: " + obj);
			}
		};
		
		list1.forEach(consumer);
	}
}
