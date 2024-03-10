import java.util.*;

class K{
	public static void main(String[] args){
		System.out.println("main");

	}
	static {
		System.out.println("SIB");
		main(null);
	}
}
/*
K<***>:-
-we can call main method also

E<***>:-
Q. is there any possiblity to rum any thing before calling main()?

-all initilizer will run before main method
-here static int i, static j and static block are initilizer and it is running before calling main method
-

*/
