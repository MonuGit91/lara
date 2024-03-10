import java.util.*;

class O{
	int i;
	O(int i){
		System.out.println("O(int)");
		this.i = i;
	}
	public static void main(String[] args){
		System.out.println("main begin");
		O obj1 = new O(10);
		System.out.println("---------");
		O obj2 = new O(20);
		System.out.println("---------");
		O obj3 = new O(30);
		System.out.println("---------");
		System.out.println(obj1.i + ", " + obj2.i + ", "+ obj3.i);
		System.out.println("main end");
	}
}
/*
O:-
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
