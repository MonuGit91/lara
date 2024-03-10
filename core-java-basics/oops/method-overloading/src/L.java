class A{
	void test(){
		System.out.println("test()");
	}
}
class L extends A{
	void test(int i) {
		System.out.println("test(int)");
	}
    public static void main(String[] args) {
        L obj = new L();
        obj.test();
        obj.test(10);
        System.out.println("main");
    }
}