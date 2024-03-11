class A {
	void test(){
		System.out.println("from A.test");
	}
}
class B extends A{
	void test() {
		System.out.println("from B.test");
	}
}
class C extends B{
    void test(){
        System.out.println("from C.test");
    }
}
class M2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();
        B b1 = new B();
        B b2 = new C();

        A[] elements = {a1, a2, a3, b1, b2};
        for(A element : elements){
        	element.test();
        }
        System.out.println("HelloWorld");
    }
}