package pack1;

public class M7 {
	public static void main(String[] args) {
		System.out.println("main begin");
		Object obj = new Integer("90");
		String s1 = (String) obj;
		System.out.println("main end");
	}
}
//main begin
//Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//	at exceptionHandeling/pack1.M7.main(M7.java:7)