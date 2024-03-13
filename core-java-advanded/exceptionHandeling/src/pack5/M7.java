package pack5;

import java.sql.DriverManager;

public class M7 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		test1();
	}
	static void test1() throws Exception{
		test2();
	}
	static void test2() throws Exception {
		int i = 10/0;
		Class.forName("");
		DriverManager.getConnection("");
		Thread.sleep(234);
	}
}
