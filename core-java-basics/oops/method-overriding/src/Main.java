import java.util.*;

class A{
	final void test1(){
		System.out.println("A.test1()");
	}
}
class B extends A{
	final void test1(){//final method can not overrided
		System.out.println("B.test1()");
	}
}
class Main {
    public static void main(String[] args) {
    }
}
/*
-final method can not overrided
*/