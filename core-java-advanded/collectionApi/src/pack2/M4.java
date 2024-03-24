package pack2;

import java.util.LinkedList;

public class M4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(190);
		list.add(1190);
		list.add(1190);
		list.add(1910);
		list.add(901);
		list.add(910);
		System.out.println(list);
		System.out.println(list.poll());//remove first element
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
	}

}
/*
through peek and poll we are arching perfect queue
*/