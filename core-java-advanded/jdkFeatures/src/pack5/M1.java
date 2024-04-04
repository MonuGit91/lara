package pack5;
import java.util.*;
import java.util.stream.Stream;

//Java Stream Creation
public class M1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(190);
		list.add(910);
		list.add(290);
		Stream<Integer> stream1 = list.stream();
		stream1.forEach(System.out::println);
	}
}
/*
stream means to process elements in java
finding max, min, total no of elements, filter based on some boolean condintion


*/