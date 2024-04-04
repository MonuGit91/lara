package pack5;

import java.util.*;
import java.util.stream.Stream;

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		set.add(90);
		set.add(901);
		set.add(190);
		set.add(910);
		set.add(290);
		Stream<Integer> stream1 = set.stream();
		stream1.forEach(System.out::println);
	}

}
