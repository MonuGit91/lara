package pack4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(10);
		list.add(130);
		list.add(300);
		list.add(125);
		System.out.println(list);
		for(Integer obj : list) { 
			System.out.print(obj + ", ");
		}
		System.out.println();
		Consumer<Integer> consumer = new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.print(t + " , ");
			}
		};
		list.forEach(consumer);
		list.forEach(element -> System.out.print(element + ", "));
		System.out.println();
		list.forEach(System.out::print);
		System.out.println();
		list.forEach(System.out::println);
		
		
	}

}
/*
 * 
 * consumer is a functional method introduced in jdk8 
 * it has one method accept 
 * 
 * 
 */
