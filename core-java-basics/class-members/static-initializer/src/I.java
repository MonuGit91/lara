import java.util.*;

class I{
	static {
		System.out.println("SIB");
	}
	public static void main(String[] args){
		System.out.println("main");

	}
}
/*
E<***>:-
Q. is there any possiblity to rum any thing before calling main()?

-all initilizer will run before main method
-here static int i, static j and static block are initilizer and it is running before calling main method
-

*/
