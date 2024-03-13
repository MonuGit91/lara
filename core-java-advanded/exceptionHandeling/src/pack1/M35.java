package pack1;

public class M35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		if(true) {
			return;
		}
		try {
			System.out.println(2);
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
