import java.util.*;
interface A{
	void test1();
	void test2();
}
abstract class B implements A{
	public void test1() {
		System.out.println("B-test1");
	}
}
class T extends B{
	public void test2() {
		System.out.println("T-test2");
	}
	public static void main(String[] args){
		T obj = new T();
		obj.test1();
		obj.test2();
		System.out.println("HelloWorld");

	}
}
/*
output:
B-test1
T-test2
HelloWorld
*/