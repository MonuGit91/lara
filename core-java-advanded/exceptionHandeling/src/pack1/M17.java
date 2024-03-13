package pack1;

public class M17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		int x = 10/0;
		try {
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println("form catch: " + ex.getMessage());
		}
		System.out.println("main end");

	}

}
/*
what ever exception object is occurring in the try those only handling by the catch
*/