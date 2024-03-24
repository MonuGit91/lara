package pack2;

import java.util.PriorityQueue;

public class M10 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(190.0);//ClassCastException
		queue.add(1190);
		queue.add(950);
		System.out.println(queue);
	}
}
/*
hedrogenious object type is not alloud
*/