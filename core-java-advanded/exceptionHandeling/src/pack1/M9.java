package pack1;

public class M9 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int[] elements = new int[999999999];
		System.out.println("main end");
	}
}
//What is the diffrence between Error and Exception

//main begin
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//	at exceptionHandeling/pack1.M9.main(M9.java:6)

//is the abnormal condition due to java statement so it will called as exception object
//if abnormal statement is due to external resources then it is called as Error object