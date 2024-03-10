import java.util.*;

class F{
	F() {
		System.out.println("f()");
	}
	F(int i) {
		System.out.println("f(int)");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		F obj1 = new F();
		System.out.println("----------");
		F obj2 = new F();
		System.out.println("----------");
		F obj3 = new F(30);
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
