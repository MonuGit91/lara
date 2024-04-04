package pack7;

import java.util.Spliterator;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
/*
M1:
List
iterator
forEachRemaining()
Consumer -> accept()
Lamda expression
System.out::println

M2:
list.removeIf(c1 -> (c1 % 40 == 0));

M3:
list.replaceAll(c1 ->(c1 + 5));

M4:
list.sort((c1, c2) ->c1.compareTo(c2));

M5:
map.getOrDefault(19, "some default")

M6:
map.putIfAbsent(11, "new done");

M7:
map.compute(6,  (k, v)->v.concat("test    "));

M8:
map.merge(6,  "new", (v1, v2)->v1+v2);

M9:
Spliterator<Integer> it = list.spliterator();
it.forEachRemaining(t1 -> System.out.println(t1));
*/