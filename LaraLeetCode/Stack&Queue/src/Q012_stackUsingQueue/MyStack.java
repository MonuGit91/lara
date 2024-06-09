package Q012_stackUsingQueue;

import java.util.Queue;
import java.util.LinkedList;

public class MyStack {
	Queue<Integer> queue1;
	Queue<Integer> queue2;

	MyStack() {
		this.queue1 = new LinkedList<>();
		this.queue2 = new LinkedList<>();
	}

	public void push(int val) {
		queue2.offer(val);
		while (!queue1.isEmpty()) {
			queue2.offer(queue1.poll());
		}
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
	}

	public int pop() {
		return queue1.poll();
	}

	public int peek() {
		return queue1.peek();
	}

	public boolean isEmpty() {
		return queue1.isEmpty();
	}

	public String toString() {
		return queue1.toString();
	}
}