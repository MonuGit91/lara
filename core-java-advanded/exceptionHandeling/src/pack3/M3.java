package pack3;

public class M3 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			System.out.println(1);
			main(null);
			System.out.println(2);
		}
		catch(StackOverflowError err) {
			System.out.println(3);
		}
		System.out.println("main end");
	}

}
/*
 * 
 * 
 * 
 * 
 * 
 */
