package pack2;
interface J{
	void test(int i);
}
public class M7 {
	public static void main(String[] args) {
		J j1 = (int i) -> System.out.println("from test: " + i);
		j1.test(10);
		System.out.println("done");
	}
}
