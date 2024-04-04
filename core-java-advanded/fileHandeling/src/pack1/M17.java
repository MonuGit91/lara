package pack1;

import java.io.File;

public class M17 {
	public static void main(String[] args) {
		File f1 = new File("/Users/narenderkumarchoudhary/Public/Education/lara/workspace2/fileHandeling/");
		File[] members = f1.listFiles();
		for(File file : members) {
			System.out.println(file.getName());
		}
	}
}
