package pack1;

import java.io.File;

public class M4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f1 = new File("hello4.java");
		boolean flag = f1.createNewFile();
		System.out.println("done: " + flag);
	}

}
/*
f1.createNewFile() create file only once and returns true 
if we try to create same file again then it will return false
*/