package pack1;

public class M15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		try {
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
//this is the third way to print exception
//using this way we can get more information of an exception which ever handeled