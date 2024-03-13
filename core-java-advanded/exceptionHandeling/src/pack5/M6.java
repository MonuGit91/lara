package pack5;

public class M6 {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		test1();
	}
	static void test1() throws ArithmeticException{
		test2();
	}
	static void test2() throws ArithmeticException {
		int i = 10/0;
	}

}
/*
in this unchecked exception we can skip throws even then compile success
*/