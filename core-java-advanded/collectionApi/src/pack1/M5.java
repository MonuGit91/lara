package pack1;

import java.util.ArrayList;

public class M5 {

	@SuppressWarnings("unchecked")
	public static void main (String[] args) {
		ArrayList list1 = new ArrayList();
		for(String s1 : args) {
			list1.add(s1);
		}
		System. out.println(list1);
	}

}
