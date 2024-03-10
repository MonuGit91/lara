import java.util.*;

class H{
	public static void main(String[] args){
		System.out.println("main begin");
		H f1 = new H(90);
		System.out.println("main end");
	}
}
/*
System.out.println();
G:-
-constructor should not have a return type, mathod should have a return type
-method can have any name including class name
-here G() is a method not constructor


-constructor name = class name ****
-it should not be static ****
-it should not have any return type ****
-constructor will executed at the time object creation automatically.
-every class should have minimum one constructor
-if there is class withoud any constructor compiler will provide default constructor while compiling
-in the constructor body default this is also available
-while creating an oject you should specify available constructor
*/
