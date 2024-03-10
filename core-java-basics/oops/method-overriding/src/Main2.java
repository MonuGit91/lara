class A{
	static void test(){
		System.out.println("A.test()");
	}
}
class B extends A{
	// void test(){//overrided and overriding both method should be static if any one is static
	// 	System.out.println("B.test()");
	// }
	static void test(){//overrided and overriding both method should be static if any one is static
		System.out.println("B.test()");
	}
}
class Main2 {
    public static void main(String[] args) {
        B obj = new B();
        A a = obj;
        B b = obj;
        a.test();
        b.test();
    }
}
/*
output:
A.test()
B.test()

-static methods can overrided but point is that "overriding and overrided both method should be static if any one is static".
 after overriding static method object will call then method, in which refrence it is stored
 eg: here we have created objecto of B and when we store it to A then it will cll A's test() and if we store it in B then it will call B's test() 
*/
