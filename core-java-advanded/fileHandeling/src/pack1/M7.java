package pack1;

import java.io.File;
import java.io.IOException;

public class M7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("/Users/narenderkumarchoudhary/Public/Education/lara/workspace2/fileHandeling/hello7.txt");
		System.out.println("a: " + f1.exists());
		
		try {
			System.out.println("b: " + f1.createNewFile());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("c: " + f1.exists());
		System.out.println("done");
	}
}
