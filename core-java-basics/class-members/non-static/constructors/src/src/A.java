import java.util.*;

class A(){
	A() {
		System.out.println("A()");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("--------");
		A a2 = new A();
		System.out.println("--------");
		A a3 = new A();
		System.out.println("--------");


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
