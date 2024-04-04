package pack1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class M9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter out = new FileWriter("test22.txt", true);
		BufferedWriter bout = new BufferedWriter(out);
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		
		bout.flush();
		bout.close();
		System.out.println("done");
	}

}
