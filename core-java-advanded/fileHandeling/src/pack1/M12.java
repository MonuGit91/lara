package pack1;

import java.io.File;
public class M12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("dir1");
		System.out.println(f1.mkdir());
		System.out.println("done");
	}

}
/*
if file is not created then mkdir() will create and return true
else it will not create and just return false

*/