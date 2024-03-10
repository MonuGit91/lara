import java.util.*;

class D{
	int i;
	D() {
		System.out.println("D(): " + i);
		i = 20;// this.i = 20 -> compiler //this key word is optional
	}
	public static void main(String[] args){
		System.out.println("main begin");
		D obj1 = new D();
		System.out.println("--------");
		D obj2 = obj1;
		System.out.println("--------");
		D obj3 = obj2;
		System.out.println("--------");
		System.out.println(obj1.i + ", " + obj2.i + ", " + obj3.i);
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
