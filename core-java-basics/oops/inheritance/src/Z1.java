class A {
	static {
		System.out.println("A-SIB");
	}
	A(){
		System.out.println("A()");
	}
	{
		System.out.println("A-IIB");
	}
}
class B extends A{
	static {
		System.out.println("B-SIB");
	}
	B(){
		System.out.println("B()");
	}
	{
		System.out.println("B-IIB");
	}
	
}
class C extends B{
	static {
		System.out.println("C-SIB");
	}
	C(){
		System.out.println("C()");
	}
	{
		System.out.println("C-IIB");
	}
}
class Z1 {
	static {
		System.out.println("Z-SIB");
	}
    public static void main(String[] args) {
    	A a1 = new A();
    	System.out.println("--------------");
    	A a2 = new A();
        System.out.println("=============");
        B b1 = new B();
        System.out.println("--------------");
        B b2 = new B();
        System.out.println("=============");
        C c1 = new C();
        System.out.println("--------------");
        C c2 = new C();
        System.out.println("main end");
    }
}
/*
Z-SIB
A-SIB
A-IIB
A()
--------------
A-IIB
A()
=============
B-SIB
A-IIB
A()
B-IIB
B()
--------------
A-IIB
A()
B-IIB
B()
=============
C-SIB
A-IIB
A()
B-IIB
B()
C-IIB
C()
--------------
A-IIB
A()
B-IIB
B()
C-IIB
C()
main end
*/