package pack1;

public class M34 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10/0;
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
			return;
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
