package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class M1 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("test1.txt");
		FileWriter out = new FileWriter(f1);
		out.write("hello");
		out.write("test");
		out.write("abc");
		out.write("xyz");
		out.write("hi");
		out.write("end");
		out.flush();//required before close()
		out.close();
		System.out.println("done");
	}
}
/*
if file is not availabel it will create a new file
otherwise it eill take the existing file
*/