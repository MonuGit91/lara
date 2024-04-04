package pack1;

interface Aa{
	void test1();
	public static void test2() {//jdk 8 feature
		System.out.println("from Aa.test1");
	}
}
class B implements A{
	public void test1() {
		System.out.println("from B.test1");
	}
}
class C implements Aa{
	public void test1() {
		System.out.println("from C.test1");
	}
}
class D implements Aa{
	public void test1() {
		System.out.println("from D.test1");
	}
}
public class M7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.test1();
		C c1 = new C();
		c1.test1();
		D d1 = new D();
		d1.test1();
		Aa.test2();
	}
}
/*
static method of Aa is only visible in Aa.
*/