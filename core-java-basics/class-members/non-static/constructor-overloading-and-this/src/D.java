import java.util.*;

class D{
	D(int i) {
		System.out.println("D(int)");
	}
	D(int j) {
		System.out.println("D(int)");
		System.out.println("D(int)");
		System.out.println("D(int)");
		System.out.println("D(int)");
	}
	public static void main(String[] args){
		System.out.println("main");
	
	}
}
/*

Q.what is the need of constructor overloading
-through constroctor overloding we are acihiving multiple ways of object creation

-developing multiple constructor in the same class by changing constructor signature is call constructor overloading
-while constructor overloading we have to take care number of argument or datatype of argument should change
-arguments in side parenthesis will  calles as siguature
-any number of method overloading can done but signature should be unique

*/
