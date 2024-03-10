import java.util.*;

class C{
	public static void main(String[] args){
		int i = 10;
		String j = "abc";
		System.out.println(i==j);
		System.out.println(1.5==j);
		System.out.println(false==j);
		System.out.println(i==true);
		System.out.println(j==true);

	}
}
/*
Compile Time:
error: bad operand types for binary operator '=='
		System.out.println(i==j);
		                    ^
  first type:  int
  second type: String
C.java:8: error: bad operand types for binary operator '=='
		System.out.println(1.5==j);
		                      ^
  first type:  double
  second type: String
C.java:9: error: bad operand types for binary operator '=='
		System.out.println(false==j);
		                        ^
  first type:  boolean
  second type: String
C.java:10: error: incomparable types: int and boolean
		System.out.println(i==true);
		                    ^
C.java:11: error: bad operand types for binary operator '=='
		System.out.println(j==true);
		                    ^
  first type:  String
  second type: boolean


*/
