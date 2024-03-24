package pack6;

import java.util.ArrayList;
import java.util.Collections;

class A{
	int i;
	A(int i){
		this.i = i;
	}
	public String toString() {
		return "i= " + i;
	}
}
public class M8 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new A(90));
		list.add(new A(9));
		list.add(new A(0));
		list.add(new A(80));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
/*
java.lang.ClassCastException
*/