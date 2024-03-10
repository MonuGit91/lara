import java.util.*;

class A{
	int i;
	public static void test(){
		A obj = new A();
		System.out.println(obj.i);
		obj.i = 10;
		System.out.println(obj.i);
		System.out.println("test end");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
