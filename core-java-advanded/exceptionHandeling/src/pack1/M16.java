package pack1;

public class M16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		try {
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
		catch(NullPointerException ex) {
			System.out.println("form catch: " + ex.getMessage());
		}
		System.out.println("main end");
	}
}
/*
main begin
1
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptionHandeling/pack1.M16.main(M16.java:9)


*/