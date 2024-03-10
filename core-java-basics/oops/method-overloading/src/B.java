import java.util.*;

class A{
	void test(){
		System.out.println("test()");
	}
	void test(int i){
		System.out.println("test(int)");
	}
	void test(double i){
        System.out.println("test(double)");
    }
}
class B{
	public static void main(String[] args){
		A a = new A();
		a.test();
		a.test(10);
		a.test(2.5);
		System.out.println("done");
	}
}
