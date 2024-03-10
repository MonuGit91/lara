import java.util.*;
interface A{
	void test1();
	void test2();
}
interface B{
	void test3();
	void test4();
}
interface C extends A, B{
	void test5();
	void test6();
}
class W implements C{
	public void test1() {
		System.out.println("W-test1");
	}
	public void test2() {
        System.out.println("W-test2");
    }
	public void test3() {
        System.out.println("W-test3");
    }
	public void test4() {
        System.out.println("W-test4");
    }
	public void test5() {
        System.out.println("W-test5");
    }
	public void test6() {
        System.out.println("W-test6");
    }
	public static void main(String[] args){
		W obj = new W();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		obj.test6();
		System.out.println("done");

	}
}
