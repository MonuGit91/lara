class A {
	A(){
		System.out.println("A()");
	}
	{
		System.out.println("A-IIB");
	}
}
class B extends A{
	B(){
		System.out.println("B()");
	}
	{
		System.out.println("B-IIB1");
	}
	{
		System.out.println("B-IIB2");
		System.out.println("B-IIB2");
		System.out.println("B-IIB2");
	}
	
}
class W {
    public static void main(String[] args) {
    	A a1 = new A();
        System.out.println("-------------");
        A a2 = new A();
        System.out.println("-------------");
        B b1 = new B();
        System.out.println("-------------");
        B b2 = new B();
    }
}
/*
A-IIB
A()
-------------
A-IIB
A()
-------------
A-IIB
A()
B-IIB1
B-IIB2
B-IIB2
B-IIB2
B()
-------------
A-IIB
A()
B-IIB1
B-IIB2
B-IIB2
B-IIB2
B()
*/