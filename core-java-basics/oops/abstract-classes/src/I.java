import java.util.*;
abstract class A{
	abstract void test1();
	void test2(){
		System.out.println("A-test2");
	}
}
abstract class I extends A{
	public static void main(String[] args){
		System.out.println("done");

	}
}
