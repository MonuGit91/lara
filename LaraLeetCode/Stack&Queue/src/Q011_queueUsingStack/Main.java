package Q011_queueUsingStack;

public class Main {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.push(10);
		queue.push(20);
		queue.push(40);
		queue.push(70);

		System.out.println(queue);
		System.err.println(queue.peek());

		System.out.println(queue);
		System.err.println(queue.pop());
		System.out.println(queue);
		
		
		
//		MyQueue queue = new MyQueue();
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(40);
//		queue.enqueue(70);
//
//		System.out.println(queue);
//		System.err.println(queue.peek());
//
//		System.out.println(queue);
//		System.err.println(queue.dequeue());
//		System.out.println(queue);
	}
}
