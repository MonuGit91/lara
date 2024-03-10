import java.util.*;
abstract class A{
	abstract void test();
	void test2(){}
}
class G{
	A obj;
	void method1(A a1) {}
	A method2(){
		return null;
	}
	public static void main(String[] args){
		A a = null;
		System.out.println("G_class");

	}
}
