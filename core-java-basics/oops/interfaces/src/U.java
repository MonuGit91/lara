import java.util.*;
interface A{
	void test1();
	void test2();
}
class B{
	public void test1() {
		System.out.println("B-test1");
	}
}
class U extends B implements A{//order should be this only
	public void test2() {
		System.out.println("U-test2");
	}
	public static void main(String[] args){
		U obj = new U();
		obj.test1();
		obj.test2();
		System.out.println("HelloWorld");

	}
}
