package pack4;

import java.util.*;
import java.util.function.BiConsumer;
//import java.util.function.BiConsumer;
public class M2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,  "abc");
		map.put(2,  "xyz");
		map.put(3, "test");
		map.put(4, "hello");
		map.put(5, "java");
		System.out.println(map);
		BiConsumer<Integer, String> biConsumer = new BiConsumer<Integer, String>(){
			public void accept(Integer t, String u) {
				System.out.println(t + " : " + u);
			}
		};
		map.forEach(biConsumer);
		map.forEach((k, v)->System.out.println(k + ", "+v));
//		map.forEach(System.out::println);//we can not assign println here because accept method is taking 2 arguments
	}
}

