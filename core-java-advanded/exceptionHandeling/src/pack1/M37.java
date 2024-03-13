package pack1;

public class M37 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10/0;
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
			System.exit(0);
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
/*
 * before reaching to finally if any ware System.exit() is encountere then
 * finally will not execute
 * 
 * 
 * if exception occured before try then finally will not run
 * if before try we are returning then finally will not run
 * if any ware System.exit() encountered before finally then finally will not run
 *
 */