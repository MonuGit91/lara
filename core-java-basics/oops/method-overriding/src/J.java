class A{
	void test(){
		System.out.println("A.test()");
	}
}
class J extends A{
	void test(){
		System.out.println("J.test() begin");
		super.test();
		System.out.println("J.test end");
	}
	public static void main(String[] args) {
		J obj = new J();
		obj.test();
        System.out.println("done");
    }
}
/*
see line 9
*/