class A{
	void test1(){}
	final void test2() {}
}
class B extends A{
	void test1(){}
	void test2(){}
}
class M1 {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}
/*
final method can not be overrided in subclass
final variable should be attempted to modify in sub class
*/