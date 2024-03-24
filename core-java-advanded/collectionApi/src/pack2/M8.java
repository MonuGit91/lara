package pack2;

import java.util.PriorityQueue;

public class M8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue queue = new PriorityQueue();
		queue.add(990);
		queue.add(690);
		queue.add(90);
		queue.add(950);
		queue.add(990);
		queue.add(60);
		queue.add(70);
		queue.add(790);
		queue.add(1000);
		System.out.println(queue);
		System.out.println(queue.poll());//reading and remove first element
		System.out.println(queue);
		System.out.println(queue.poll());//reading and remove first element
		System.out.println(queue);
	}
}
/*


*/