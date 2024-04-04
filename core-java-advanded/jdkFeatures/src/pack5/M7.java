package pack5;

import java.util.stream.Stream;

public class M7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream1 = Stream.of(10, 20, 50);
		stream1.forEach(System.out::println);
		System.out.println("---------------");
		
		Stream<Double> stream2 = Stream.of(4.5,5.9, 6.1, 5.7);
		stream2.forEach(System.out::println);
		System.out.println("-------------");
		
		Stream<String> stream3 = Stream.of("and", "hello", "test");
		stream3.forEach(System.out::println);
	}
}
/*
 streams are not only for collectiona and array it is for any group of elemtnts
 
 
 
 
 */
