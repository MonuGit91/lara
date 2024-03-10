import java.util.*;

class L{
	int i;
	L(){
		System.out.println("L()");
		i = 20;
	}
	public static void main(String[] args){
		System.out.println("main begin");
		L obj1 = new L();
		System.out.println("---------");
		L obj2 = new L();
		System.out.println("---------");
		L obj3 = new L();
		System.out.println("---------");
		System.out.println(obj1.i + ", " + obj2.i + ", "+ obj3.i);
		System.out.println("main end");
	}
}
/*
Q. why do we required argumented constructor, what is it's need.
-if we have created any constructor then we do not have default constructor


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
