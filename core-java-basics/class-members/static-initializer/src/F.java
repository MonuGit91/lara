import java.util.*;

class F{
	static {
		System.out.println("from SIB1");
	}
	static int i = test1();
    static int j = test2();
	static {
		System.out.println("from SIB2");
	}
	static int test1() {
		System.out.println("from test1");
		return 10;
	}
	static int test2() {
        System.out.println("from test2");
        return 20;
    }
	public static void main(String[] args){
		System.out.println(i+","+j);

	}
}
/*
E<***>:-
Q. is there any possiblity to rum any thing before calling main()?

-all initilizer will run before main method
-here static int i, static j and static block are initilizer and it is running before calling main method
-

*/
