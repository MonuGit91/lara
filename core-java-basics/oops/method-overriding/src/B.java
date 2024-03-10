class A{
	void test(){
		System.out.println("A.test()");
	}
}
class B extends A{
	void test() {
		System.out.println("B.test()");
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
		System.out.println("done");
	}
} 