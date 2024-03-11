class A {
    static int i = 20;
    static {
        System.out.println("A.SIB");
    }
}
class B extends A{
	static {
        System.out.println("B.SIB");
    }
}

class M4 {
    public static void main(String[] args) {
        System.out.println(B.i);
    }
}

/*
super class static members not becoming the member of sub class
static member are member of corrent class 
static member not enherited 


-non static method can overrided with non static only
-static members not envolveing in the polymorphism because polymorphism required method overrideing and aut upcasting 
    but here upcasting is done but overriding not doing
-static not accept any changes


-same statiement gives multiple output while running is called polymorphism
*/