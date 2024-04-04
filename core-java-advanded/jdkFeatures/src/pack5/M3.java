package pack5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class M3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "siril");
		map.put(2, "sanju");
		map.put(3, "pranay");
		map.put(4, "babu");

		Stream<Entry<Integer, String>> stream1 = map.entrySet().stream();
		Stream<Integer> stream2 = map.keySet().stream();
		Stream<String> stream3 = map.values().stream();
		
		stream1.forEach(System.out::println);
		System.out.println("-----------");
		stream2.forEach(System.out::println);
		System.out.println("-----------");
		stream3.forEach(System.out::println);

	}
}
/*
stream is not for map so we should convert to colletion

stream is used in premitive, and Collection 

*/