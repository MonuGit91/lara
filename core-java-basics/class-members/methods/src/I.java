import java.util.*;

class I{
	public static void main(String[] args){
		System.out.println("main begin");
		test1();
		System.out.println("--------------");
		test2();
		System.out.println("main end");
	}
	public static void test1() {
		System.out.println("from test1");
	}
	public static void test2() {
		System.out.println("form test2");
	}
}
/*
H:-
-sop should be always there inside method only

G:-
-i of main method only visible to main method
-i of test method only visible to test method

-methods are mainly for achiving reusablity
-we can use same reusable code again and again

*/
