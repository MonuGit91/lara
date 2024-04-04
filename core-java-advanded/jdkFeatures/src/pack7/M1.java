package pack7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class M1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(70);
		list.add(60);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(10);
		Iterator<Integer> it = list.iterator();
		Consumer<Integer> c1 = new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		//it.forEachRemaining(c1);
		System.out.println("------------------");
		//it.forEachRemaining(element -> System.out.println(element));
		System.out.println("-----------");
		it.forEachRemaining(System.out::println);
	}
}
/*
Collection api improvements:
-------------------------------
1.in the itterator class added new method forEachReamaining

2.in the iterable new method added forEach()

3.in the list removeIf(), replaceAll, sort, 

4.in the map:
getOrDefault(), BiConsumer, replaceALl, putIfAbsent, compute, merge

5.splIterator


*/