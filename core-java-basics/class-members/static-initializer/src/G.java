import java.util.*;

class G{
	static int i = test1();
    static int j = test2();
	static {
		System.out.println("from SIB: "+i+","+j);//10,20
	}
	static int test1() {
		System.out.println("from test1: "+i+","+j);//0,0
		return 10;
	}
	static int test2() {
        System.out.println("from test2: "+i+","+j);//10,0
        return 20;
    }
	public static void main(String[] args){
		System.out.println(i+","+j);//10,20

	}
}
/*
E<***>:-
Q. is there any possiblity to rum any thing before calling main()?

-all initilizer will run before main method
-here static int i, static j and static block are initilizer and it is running before calling main method
-

*/
