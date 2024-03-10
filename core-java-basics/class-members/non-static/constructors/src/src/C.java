import java.util.*;

class C{
	int i;
	C() {
		System.out.println("C()");
		this.i = 20;// this key word is optional
	}
	public static void main(String[] args){
		System.out.println("main begin");
		C a1 = new C();
		System.out.println("--------");
		C a2 = new C();
		System.out.println("--------");
		C a3 = new C();
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
