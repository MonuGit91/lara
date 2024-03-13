package pack5;

import java.sql.DriverManager;
import java.sql.SQLException;

public class M11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	static void test1(){
		try {
			test2();
		}
		catch(Exception e) {
			
		}
		
		
	}

	static void test2() throws ClassNotFoundException, SQLException, InterruptedException{
		Class.forName("");
		DriverManager.getConnection("");
		Thread.sleep(234);

	}
}
