import java.util.*;
class A{
	static int i;
}
class P{
	public static void main(String[] args){
		//System.out.println("main:" + i);
		System.out.println("main:" + A.i);

	}
}
/*
- we can save the java file using any class name present in file
- but for running main() you should save the file name same as class holding main()
- if any public class is present then only we have to choose then name as public class name
*/
