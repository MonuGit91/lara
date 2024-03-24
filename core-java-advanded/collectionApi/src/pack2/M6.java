package pack2;

import java.util.LinkedList;

public class M6 {

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
		System.out.println(list.pollLast());//remove last element
		System.out.println(list);
		System.out.println(list.pollLast());//remove last element
		System.out.println(list);
	}

}
/*
through pollLast and peekLast we are archeaving stack

*/