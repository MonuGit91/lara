import java.util.*;

class I {
	static protected double test(){
		System.out.println("test()");
		return 1.5;
	}
	final public void test(double k) {
		System.out.println("test(double)");
		System.out.println("test(double)");
		System.out.println("test(double)");
		System.out.println("test(double)");
	}
	private int test(boolean i) {
		System.out.println("test(boolean)");
		return 10;
	}
    
}
/*
overloaded method can take static, final, private independently
*/