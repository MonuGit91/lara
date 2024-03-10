import java.util.*;

class B{
	int i;
	B() {
		System.out.println("B()");
		this.i = 20;
	}
	public static void main(String[] args){
		System.out.println("main begin");
		B a1 = new B();
		System.out.println("--------");
		B a2 = new B();
		System.out.println("--------");
		B a3 = new B();
		System.out.println("--------");
		System.out.println(a1.i + ", " + a2.i + ", " + a3.i);
		System.out.println("main end");

	}
}
/*
-constructor name = class name
-it should not be static
-it should not have any return type
-constructor will executed at the time object creation
-every class should have minimum one constructor
-if there is class withoud any constructor compiler will provide default constructor while compiling
-in the constructor body default this is also available
-while creating an oject you should specify available constructor
*/
