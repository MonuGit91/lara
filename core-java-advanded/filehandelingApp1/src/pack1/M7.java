package pack1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("test3.txt");
		char[] chars = new char[100];
		FileReader fin = null;
		try {
			fin = new FileReader(f1);
			fin.read(chars);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(fin != null) {
				try {
					fin.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
			
		}
		
		String s1 = new String(chars);
		System.out.println(s1);
	}

}
