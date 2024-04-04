package pack2;

interface K{
	void test(int i);
}
public class M8 {
	public static void main(String[] args) {
		K k1 = (i) -> System.out.println("from test: " + i);
		k1.test(10);
		System.out.println("done");
	}
}


