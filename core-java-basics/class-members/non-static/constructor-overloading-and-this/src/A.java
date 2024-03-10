import java.util.*;

class A{
	A(){}
	A(int i) {
		System.out.println("A(int)");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("----------");
		A a2 = new A(20);
		System.out.println("----------");
		A a2 = new A(120);
		System.out.println("----------");
		System.out.println("main end");
	
	}
}
/*
-developing multiple constructor in the same class is call constructor overloading
-while constructor overloading we have to take care number of argument or datatype of argument should change
-arguments in side parenthesis will  calles as siguature
-any number of method overloading can done but signature should be unique

*/
