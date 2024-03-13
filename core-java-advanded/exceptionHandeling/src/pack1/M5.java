package pack1;

public class M5 {
	public static void main(String[] args) {
		System.out.println("main begin");
		Object obj = new Object();
		String s1 = (String) obj;
		System.out.println("main end");
	}
}
/* here down casting is happening in line 7 
 * 
 *
 * Exception in thread "main" java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
	at exceptionHandeling/pack1.M5.main(M5.java:7)
 */