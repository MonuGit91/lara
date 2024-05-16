package Q001_stackImplementation;

public class Main {

	public static void main(String[] args) {
		MyStack s1=new MyStack();
		s1.push(100);
		s1.push(10);
		s1.push(200);
		s1.push(160);
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		System.out.println(s1.peek());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}
}
