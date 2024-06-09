package Q011_queueUsingStack;

class Main1 {
	public static void main(String[] args) {
		MyQueue1 queue = new MyQueue1();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(40);
		queue.enqueue(70);

		System.out.println(queue);
		System.err.println(queue.peek());

		System.out.println(queue);
		System.err.println(queue.dequeue());
		System.out.println(queue);
	}
}
