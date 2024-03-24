package pack3;

import java.util.HashSet;
import java.util.TreeSet;

public class M11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add(90);
		set.add(190);
		set.add(901);
		set.add(290);
		set.add(920);
		set.add(550);
		System.out.println(set);
		TreeSet set1 = new TreeSet();
		set1.addAll(set);
		System.out.println(set1);
		
	}

}
