package pack2;

interface L{
	void test(int i, String s1);
}

public class M9 {
	public static void main(String[] args) {
		L l1 = (x, y) ->{
			System.out.println("form test");
			System.out.println("from test");
		};
		l1.test(10, "abc");
		System.out.println("done");
	}
}
