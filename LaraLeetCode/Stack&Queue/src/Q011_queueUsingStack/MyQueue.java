package Q011_queueUsingStack;

import java.util.*;
class MyQueue {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
   		stack1.push(x);
    }
    
    public int pop() {
		while(stack1.size() > 1)
		{
			stack2.push(stack1.pop());
		}
		int num = stack1.pop();
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
		}
		return num;		
        
    }
    
    public int peek() {
		while(stack1.size() > 1)
		{
			stack2.push(stack1.pop());
		}
		int num = stack1.peek();
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
		}
		return num;		
        
    }
    
    public boolean empty() {
		return stack1.isEmpty();
    }
    public String toString() {
    	return stack1.toString();
    }
}

//public class MyQueue {
//	private Stack<Integer> stack1 = new Stack<>();
//	private Stack<Integer> stack2 = new Stack<>();
//	
//	public void enqueue(int num) {
//		stack1.push(num);
//	}
//	public int peek() {
//		if(stack1.isEmpty()) {
//			System.out.println("Queue is Empty");
//			return -1;
//		}
//		while(stack1.size() > 1) {
//			stack2.push(stack1.pop());
//		}
//		int num = stack1.peek();
//		while(!stack2.isEmpty()) {
//			stack1.push(stack2.pop());
//		}
//		return num;
//	}
//	public int dequeue() {
//		if(stack1.isEmpty()) {
//			System.out.println("Queue is Empty");
//			return -1;
//		}
//		while(stack1.size() > 1) {
//			stack2.push(stack1.pop());
//		}
//		int num = stack1.pop();
//		while(!stack2.isEmpty()) {
//			stack1.push(stack2.pop());
//		}
//		return num;
//	}
//	public boolean isEmpty() {
//		return stack1.isEmpty();
//	}
//	public String toString()  {
//		return stack1.toString();
//	}
//}
