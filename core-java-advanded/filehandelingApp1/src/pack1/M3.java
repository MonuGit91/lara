package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter out = new FileWriter("test3.txt", true);//true is append status
		out.write("ehllo");
		out.write("test");
		out.write("abssjfs");
		out.write("\n");
		out.write("hi");
		out.write("endqfj544r444");
		out.flush();//required before close()
		out.close();
		System.out.println("done");
	}

}
