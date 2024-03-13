package pack5;

import java.sql.DriverManager;
import java.sql.SQLException;

public class M8 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		test1();
	}
	static void test1(){
		test2();
	}
	static void test2(){
		try {
			Class.forName("");
			DriverManager.getConnection("");
			Thread.sleep(234);
		}
		catch(SQLException ex){
			
		}
		catch(ClassNotFoundException ex) {
			
		}
		catch(InterruptedException ex) {
			
		}
		
	}
}
