package pack6;

import java.util.ArrayList;
import java.util.Collections;

class B implements Comparable{
	int i;
	B(int i){
		this.i = i;
	}
	public String toString() {
		return "i= " + i;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int result =  i-((B)o).i;
		System.out.println("comparing " + this + " and " + o + " with result: " + result);
		return result;
	}
}


public class M9 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new B(90));
		list.add(new B(9));
		list.add(new B(0));
		list.add(new B(80));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
