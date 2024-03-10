import java.util.*;
interface A{
	void test1();
	void test2();
}
interface B{
	void test3();
	void test4();
}
class V implements A, B{
	public void test1() {
		System.out.println("V-test1");
	}
	public void test2() {
		System.out.println("V-test2");
	}
	public void test3() {
		System.out.println("V-test3");
	}
	public void test4() {
		System.out.println("V-test4");
	}
	public static void main(String[] args){
		V obj = new V();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		System.out.println("HelloWorld");

	}
}
