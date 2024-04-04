package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class M6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1 = new File("test3.txt");
		char[] chars = new char[100];
		FileReader fin = new FileReader(f1);
		fin.read(chars);
		fin.close();
		String s1 = new String(chars);
		System.out.println(s1);
	}

}
