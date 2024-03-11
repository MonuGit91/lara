import java.util.*;

class Main{
	static void test(){
		System.out.println("main");
	}
}
class Main1 extends Main{
	/*static*/ void test(){
		System.out.println("main1");
	}
    public static void main(String[] args) {
        Main m = new Main1();
        m.test();
        System.out.println("HelloWorld");
    }
}