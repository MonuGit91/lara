// import java.util.*;
class A{
	static{
		System.out.println("SIB-A");
	}
	{
		System.out.println("IIB-A");
	}
}
class B extends A{
	static {
		System.out.println("SIB-B");
	}
	{
		System.out.println("IIB-B");
	}
}
class Z {
	static {
		System.out.println("SIB-main");
	}
	{
		System.out.println("IIB-main");
	}
    public static void main(String[] args) {
        B  b = new B();
        System.out.println("HelloWorld");
    }
}
/*
SIB-main
SIB-A
SIB-B
IIB-A
IIB-B
HelloWorld
*/