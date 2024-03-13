package pack5;

import java.sql.DriverManager;
import java.sql.SQLException;

public class M9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	static void test1() {
		test2();
	}

	static void test2() {
		try {
			int i = 10 / 0;
			Class.forName("");
			DriverManager.getConnection("");
			Thread.sleep(234);
		} catch (Exception ex) {

		}

	}
}
