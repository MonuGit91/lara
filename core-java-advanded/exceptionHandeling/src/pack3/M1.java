package pack3;

public class M1 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int i = 10/0; //ArithmeticException
		System.out.println("------------");
		int j = Integer.parseInt("xyz"); // NumberFormatException
		System.out.println("-----------");
		String s1 = null;
		int k = s1.length(); // NullPointerException
		System.out.println("----------");
		System.out.println("main end");
	}

}
