package pack1;

public class M14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		try {
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println("from catch: "+ ex.getMessage());//only reson
		}
		System.out.println("main end");
	}
}
//this is one way to print the the exception