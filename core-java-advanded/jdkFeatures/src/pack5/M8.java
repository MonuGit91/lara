package pack5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class M8 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(90);
		numbers.add(45);
		numbers.add(20);
		numbers.add(190);
		numbers.add(15);
		numbers.add(85);
		System.out.println(numbers);
		Stream<Integer> stream = numbers.stream();
		
//		List<Integer> results1 = stream.filter(new Predicate<Integer>() {//functional interface
//			public boolean test(Integer t) {
//				return t < 50;
//			}
//		}).collect(Collectors.toList());

		List<Integer> results1 = stream
				.filter(t -> t < 50)
				.collect(Collectors.toList());
		System.out.println(results1);
		
		Stream<Integer> stream2 = numbers.stream();
		List<Integer> result2 = stream2
				.filter(t-> (t%2 == 0))
				.collect(Collectors.toList());
		System.out.println(result2);
	}
}
/*

one stream can be used only one time

*/
