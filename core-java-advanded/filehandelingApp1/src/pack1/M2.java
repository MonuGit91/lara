package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1 = new File("test1.txt");
		FileWriter out = new FileWriter(f1);
		out.write("hello\n");
		out.write("test\n");
		out.write("abc\n");
		out.write("xyz\n");
		out.write("hi\n");
		out.write("end");
		out.flush();//required before close()
		out.close();
		System.out.println("done");
	}

}
