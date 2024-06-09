package Q011_queueUsingStack;

import java.util.Stack;

public class MyQueue1 {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public boolean isEmpty() {
		return s1.isEmpty();
	}
	public int size() {
		return s1.size();
	}
	public int peek() {
		if(s1.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return s1.peek();
	}
	public int dequeue() {
		if(s1.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return s1.pop();
	}
	public void enqueue(int val) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(val);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public String toString() {
		return s1.toString();
		
	}
}


