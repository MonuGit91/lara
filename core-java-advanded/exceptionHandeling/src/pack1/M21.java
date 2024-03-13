package pack1;

public class M21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		try {
			System.out.println(1);
			int i = 20;
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println("catch begin");
			int j = 30;//CTE
			System.out.println("catch end");
		}
//		System.out.println("main end" + ex);//CTE
//		j = 190;//CTE
	}
}
