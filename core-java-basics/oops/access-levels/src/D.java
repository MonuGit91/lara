import java.util.*;
class A{
	private void test(){
		System.out.println("from test");
	}
}
class C{
	public static void main(String[] args){
		A a1 = new A();
		a1.test();
	}
}
