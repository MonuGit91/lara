import java.util.*;

class J{
	J() {
		System.out.println("J()");
		this(90);
	}
	J(int i) {
		System.out.println("J(int)");
	}
	public static void main(String[] args){
		stem.out.println("main");
	}
}
/*
J:-
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
