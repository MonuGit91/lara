package pack1;

import java.io.File;

public class M15 {
	public static void main(String[] args) {
		File path = new File("/wrongPath");
		File f1 = new File(path, "dir4");
		System.out.println("a:" + f1.exists());
		System.out.println("b:" + f1.mkdir());//for wrong path false will return
		System.out.println("c:" + f1.exists());
		System.out.println("done");
	}
}
//No Exception