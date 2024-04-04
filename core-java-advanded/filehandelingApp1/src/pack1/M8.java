package pack1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M8 {

	public static void main(String[] args) {
		File f1 = new File("test3.txt");
		char[] chars = new char[100];

		try (FileReader fin = new FileReader(f1)) {
			fin.read(chars);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		String s1 = new String(chars);
		System.out.println(s1);

	}

}
/*
whie using FileReader and FileWriter



*/