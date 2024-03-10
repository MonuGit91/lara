import java.util.*;

class I{
	I() {
		this(10);
		System.out.println("I()");
	}
	I(int i) {
		this(i, i);//this calling statement
		System.out.println("I(int)");
	}
	I(int i, int j) {
		System.out.println("I(int, int)");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		I obj1 = new I();
		System.out.println("----------");
		I obj2 = new I();
		System.out.println("----------");
		I obj3 = new I(30);
		System.out.println("----------");
		I obj4 = new I(30, 40);
		System.out.println("----------");
		System.out.println("main end");
	}
}
/*
I:-
-this calling statement should be always be the first statement inside constructor body
-it can be used only inside constructor body not in the method
-here we are calling form one constructor to another constructor called constructor chaining


Q.what is the need of constructor overloading
-through constroctor overloding we are acihiving multiple ways of object creation

-developing multiple constructor in the same class by changing constructor signature is call constructor overloading
-while constructor overloading we have to take care number of argument or datatype of argument should change
-arguments in side parenthesis will  calles as siguature
-any number of method overloading can done but signature should be unique

*/
