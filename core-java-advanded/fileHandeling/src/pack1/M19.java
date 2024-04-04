package pack1;

import java.io.File;

public class M19 {

	public static void main(String[] args) {
		File f1 = new File("/Users/narenderkumarchoudhary/Public/Education/lara/workspace2/fileHandeling/");
		File[] members = f1.listFiles();
		int dirCount = 0, fileCount = 0;
		for(File member : members) {
			if(member.isFile()) {
				fileCount++;
			}
			else {
				dirCount++;
			}
		}
		System.out.println("file count: " + fileCount);
		System.out.println("dire count: " + dirCount);
	}
}
