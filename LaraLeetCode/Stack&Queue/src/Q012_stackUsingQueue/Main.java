package Q012_stackUsingQueue;

public class Main {

	public static void main(String[] args) {
		MyStack s1 = new MyStack();
		s1.push(10);
		s1.push(30);
		s1.push(70);
		s1.push(14);
		s1.push(2);
		s1.push(8);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		s1.push(33);
		System.out.println(s1);
	}

}
