package pack5;

public class M5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	static void test1() {
		test2();
	}
	static void test2() {
		int i = 10/0;//ArithmeticException -> compile success because it is unchecked
	}

}
