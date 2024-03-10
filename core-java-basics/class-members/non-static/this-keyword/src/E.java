import java.util.*;

class E{
	int i;
	void test(){
		System.out.println("test: " + i);
		i = 20;
	}
	public static void main(String[] args){
		E e1 = new E();
		e1.i = 10;
		System.out.println("main1: " +e1.i);
		e1.test();
		System.out.println("main2: " + e1.i);

	}
}
/*
-here i in test() compiler will replace it with this.i

*/
