package pack1;

public class M33 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			return;
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}

/*
 * here before return finally block will guarented run
 *
 */