import java.util.*;

class C{
	void test() {
		System.out.println("test: " + this);
	}
	public static void main(String[] args){
		C c1 = new C();
		System.out.println("main: " + c1);
		c1.test();
	}
}
/*
-this: it is a key word
-this: available only in the non static block not in static block


*/
