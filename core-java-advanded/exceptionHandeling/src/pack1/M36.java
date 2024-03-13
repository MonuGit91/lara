package pack1;

public class M36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			System.out.println(2);
			System.exit(0);
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
/* only this time finally will not run because System.exit() forcefully terminate the execution
 * 
 */