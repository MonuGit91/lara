class A{
	private final void test1(){}
}
class B extends A{
	void test1(){}
}
class M5{
	public static void main(String[] args) {
		System.out.println("main");
	}
}
/*
private members can not inherited to subclass so compilation success
*/