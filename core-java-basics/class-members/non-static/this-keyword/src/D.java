import java.util.*;

class D{
	int i;
	void test() {
		System.out.println("test: " + this.i);
		this.i = 20;
	}
	public static void main(String[] args){
		D d1 = new D();
		d1.i = 10;
		System.out.println("main1:" + d1.i);
		d1.test();
		System.out.println("main2: " + d1.i);

	}
}

