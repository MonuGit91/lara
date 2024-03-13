package pack1;

public class M22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		int i = 20;
		try {
			System.out.println(1);
			i += 30;
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println("catch begin");
			i += 90;//CTE
			System.out.println("catch end");
		}
		System.out.println("main end " + i);
	}
}
