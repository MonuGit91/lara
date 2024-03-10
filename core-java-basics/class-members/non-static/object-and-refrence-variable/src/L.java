import java.util.*;

class L{
	void test(){
		System.out.println("from test");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		L ref = new L();
		ref.test();
		System.out.println("--------");
		ref.test();
		System.out.println("----------");
		ref.test();
		System.out.println("----------");
		System.out.println("main end");

	}
}
