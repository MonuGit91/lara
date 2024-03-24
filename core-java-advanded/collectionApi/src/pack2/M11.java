package pack2;

import java.util.PriorityQueue;

public class M11 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(null);
		queue.add(1190);
		queue.add(950);
		System.out.println(queue);
	}
}
/*
where ever sorting is there null is not accpted
*/