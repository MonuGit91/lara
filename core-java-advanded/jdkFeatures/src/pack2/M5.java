package pack2;

interface I{
	void test();
}
public class M5 {
	public static void main(String[] args) {
		I i1 = ()->{
			System.out.println("I");
			System.out.println("I");
		};
		i1.test();
		System.out.println("done");
	}
}
