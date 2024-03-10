import java.util.*;

class C{
	enum Test{
		Hello, Hi, Java, BTM
	};
	public static void main(String[] args){
		System.out.println(Test.Hello.ordinal());
		System.out.println(Test.Hi.ordinal());
		System.out.println(Test.Java.ordinal());
		System.out.println(Test.BTM.ordinal());
		System.out.println("int min: " + Integer.MIN_VALUE);
		System.out.println("int max: " + Integer.MAX_VALUE);

	}
}
/*
0
1
2
3
int min: -2147483648
int max: 2147483647
*/
