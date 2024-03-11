class A {
	static void test(){
		System.out.println("from A.test");
	}
}
class B extends A{
	static void test() {
		System.out.println("from B.test");
	}
}

class M3 {
    static void test() {
        System.out.println("from B.test");
    }
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        A[] elements = {a1, a2};
        for(A element : elements){
        	element.test();
        }
    }
}
/*
-static method can not overrided with non static and vice versa
-static method can overrided with static only 
-non static method can overrided with non static 
-static members not envolveing in the polymorphism because polymorphism required method overrideing and aut upcasting 
    but here upcasting is done but overriding not doing
-static not accept any changes
*/