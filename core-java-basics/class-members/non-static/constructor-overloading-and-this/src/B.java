import java.util.*;

class B{
	B(double i) {
		System.out.println("B(double)");
	}
	B(int i) {
		System.out.println("B(int)");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		B a1 = new B(90);
		System.out.println("----------");
		B a2 = new B(200);
		System.out.println("----------");
		B a3 = new B(1.9);
		System.out.println("----------");
		System.out.println("main end");
	
	}
}
/*
-developing multiple constructor in the same class by changing constructor signature is call constructor overloading
-while constructor overloading we have to take care number of argument or datatype of argument should change
-arguments in side parenthesis will  calles as siguature
-any number of method overloading can done but signature should be unique

*/
