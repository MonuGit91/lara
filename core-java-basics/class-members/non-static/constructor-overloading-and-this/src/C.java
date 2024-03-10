import java.util.*;

class C{
	C(){
		System.out.println("C()");
	}
	C(double i) {
		System.out.println("C(double)");
	}
	C(int i) {
		System.out.println("C(int)");
	}
	C(int i, double j) {
		System.out.println("C(int, double)");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		C a1 = new C(90);
		System.out.println("----------");
		C a2 = new C(200);
		System.out.println("----------");
		C a3 = new C(1.9);
		System.out.println("----------");
		C a4 = new C();
		System.out.println("----------");
		System.out.println("main end");
	
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
