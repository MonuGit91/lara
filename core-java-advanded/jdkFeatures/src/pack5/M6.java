package pack5;

import java.util.Arrays;
import java.util.stream.Stream;

public class M6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] elements = {10, 20, 50, 110};
		Stream<Integer> stream1 = Stream.of(elements);
		stream1.forEach(System.out::println);
		System.out.println("---------------");
		
		Double[] heights = {4.5,5.9, 6.1, 5.7};
		Stream<Double> stream2 = Stream.of(heights);
		stream2.forEach(System.out::println);
		System.out.println("-------------");
		
		String[] names = {"and", "hello", "test"};
		Stream<String> stream3 = Stream.of(names);
		stream3.forEach(System.out::println);
	}
}
