package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("test5.txt");
		//these statements required try catch
		try(FileWriter out = new FileWriter(f1)) {//try with parantheses
			out.write("hello");
			out.write("test");
			out.write("end");
		}
		catch(IOException ex) { 
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
/*
now flush and colse is automatically taken care by try-catch

*/