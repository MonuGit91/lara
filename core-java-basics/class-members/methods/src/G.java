import java.util.*;

class G{
	public static void main(String[] args){
		int i = 10;
		System.out.println("main begin" + i);
		test();
		System.out.println("main end: " + i);
	}
	public static void test() {
		int i = 20;
		System.out.println("from test"+i);
	}
}
/*
G:-
-i of main method only visible to main method
-i of test method only visible to test method

-methods are mainly for achiving reusablity
-we can use same reusable code again and again

*/
