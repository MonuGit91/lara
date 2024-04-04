package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//best way
public class M4 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();		
		
		File f1 = new File("test4.txt");
		FileWriter out = null;
		//these statements required try-catch
		try {
			out = new FileWriter(f1);
			out.write("hello");
			out.write("test");
			out.write("end");
		}
		catch(IOException ex) { 
			ex.printStackTrace();
		}
		finally{
			if(out != null) {//must
				try {
					out.flush();
					out.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
			
		}
		System.out.println("done");
	}

}
