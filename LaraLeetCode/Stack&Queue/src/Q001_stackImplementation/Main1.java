package Q001_stackImplementation;

public class Main1 {

	public static void main(String[] args) {
		MyStack1 s1 = new MyStack1();
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
