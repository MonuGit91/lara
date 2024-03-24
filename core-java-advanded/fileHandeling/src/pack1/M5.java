package pack1;

import java.io.File;

public class M5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f1 = new File("hello5.txt");
		System.out.println("a: " + f1.exists());
		System.out.println("b: " + f1.createNewFile());
		System.out.println("c: " + f1.exists());
		System.out.println("done");
	}

}
/*
if file created then exists() will return true otherwise it will return false

*/